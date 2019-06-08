package com.xinruke.common.util;

/**
 * @ClassName CustomSecurity.java
 * @CreateDate 2019/6/8
 * @Author FengXinQiang
 * @Version V1.0.0.0
 * @Decription 定制加密工具
 */
public class CustomSecurity {

    /**
     * 加密种子
     */
    private static final int[] seeds = new int[]{5, 8, 7, 3, 4, 9, 6, 0, 1, 2};

    /**
     * <b>方法说明：</b>
     * <ul>
     * 对手机号进行加密
     * </ul>
     *
     * @param mobile 传入手机号码
     * @return
     */
    public static String encodeMobile(String mobile) {
        return encode(mobile, 4, 4);
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 对手机号进行解密
     * </ul>
     *
     * @param mobile 传入加密后的手机号
     * @return
     */
    public static String decodeMobile(String mobile) {
        return decode(mobile, 4, 4);
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 加密身份证号
     * </ul>
     *
     * @param idCard 身份证号
     * @return
     */
    public static String encodeIDCard(String idCard) {
        return encode(idCard, 4, 8);
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 解密身份证号
     * </ul>
     *
     * @param idCard
     * @return
     */
    public static String decodeIDCard(String idCard) {
        return decode(idCard, 4, 8);
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 加密银行卡号
     * </ul>
     *
     * @param bankCard 银行卡号
     * @return
     */
    public static String encodeBankCard(String bankCard) {
        return encode(bankCard, 4, 8);
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 解密银行卡号
     * </ul>
     *
     * @param bankCard
     * @return
     */
    public static String decodeBankCard(String bankCard) {
        return decode(bankCard, 4, 8);
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 获取跟踪日志的随机编号
     * </ul>
     *
     * @return String
     */
    public static String getTraceID() {
        return getTraceID("");
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 获取跟踪日志字符串
     * </ul>
     *
     * @param str 传入字符串
     * @return 跟踪日志编号
     */
    public static String getTraceID(String str) {
        StringBuilder builder = new StringBuilder();
        builder.append(str);

        String now = "" + System.currentTimeMillis();
        builder.append(now);
        builder.append(createEndStr(now));

        return builder.toString();
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 检查跟踪日志编号是否正确
     * </ul>
     *
     * @param traceID 跟踪日志编号
     * @return true 正确 false 不正确
     */
    public static boolean checkTraceID(String traceID) {
        if (traceID == null || traceID.length() < (13 + 2)) {
            return false;
        }
        String encode = traceID.substring(traceID.length() - 2, traceID.length());
        String endStr = createEndStr(getencodeStr(traceID, 13));

        return encode.equals(endStr);
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 对 SessionID 进行加密
     * </ul>
     *
     * @param sessionID
     * @return
     */
    public static String encodeSessionID(String sessionID) {
        StringBuilder builder = new StringBuilder();
        builder.append(sessionID);

        builder.append(createEndStr(sessionID));

        return builder.toString();
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 检查 SessionID 是否正确
     * </ul>
     *
     * @param sessionID
     * @return
     */
    public static boolean checkSessionID(String sessionID) {
        if (sessionID == null || sessionID.length() < 2) {
            return false;
        }
        String encode = sessionID.substring(sessionID.length() - 2, sessionID.length());
        String endStr = createEndStr(getencodeStr(sessionID, sessionID.length() - 2));

        return encode.equals(endStr);
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 通过传入字符串获取用于加密的部分
     * </ul>
     *
     * @param str             传入字符串
     * @param encodeStrLength 用于加密部分长度
     * @return
     */
    private static String getencodeStr(String str, int encodeStrLength) {
        if (str == null) {
            return "";
        }

        //传入字符串长多
        int strLength = str.length();

        if (strLength < encodeStrLength + 2) {
            return "";
        }

        return str.substring(strLength - encodeStrLength - 2, strLength - 2);
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 通过传入字符串生成末尾两位结束字符
     * </ul>
     *
     * @param str 传入字符串
     * @return
     */
    private static String createEndStr(String str) {
        if (str == null || str.length() <= 0) {
            return "00";
        }

        int n = 0;
        for (char c : str.toCharArray()) {
            n += c;
        }

        String endStr = "" + n;

        return endStr.substring(endStr.length() - 2, endStr.length());
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 执行加密
     * </ul>
     *
     * @param str          待加密字符串
     * @param lastLength   末尾保留长度
     * @param replayLength 要替换长度(从末尾保留的串向前替换)
     * @return 加密后串
     */
    private static String encode(String str, int lastLength, int replayLength) {
        //如果传入长度小于保留长度 则返回原号码
        if (str == null || str.trim().length() <= lastLength) {
            return str;
        }

        //获取手机号后四位在种子中对应的数字数组
        int[] seed = getLastSeeds(str, lastLength);

        //结果值
        String result = "";

        //遍历将字符串中的指定位置数字进行加密并放到结果中
        for (int i = str.length() - lastLength - 1, j = 0; i > str.length() - lastLength - replayLength - 1 && i >= 0; i--, j++) {
            String s = str.substring(i, i + 1);
            int n = Integer.parseInt(s, -1);
            if (n < 0) {
                result += s;
                if (j >= lastLength) {
                    j = 0;
                }
                continue;
            }

            if (j >= lastLength) {
                j = 0;
            }
            n = seed[j] + n;

            if (n > 9) {
                result += n - 10;
            } else {
                result += n;
            }
        }

        //拼装号码的前半部分和后半部分到结果中
        if (str.length() > lastLength + replayLength) {
            result = str.substring(0, str.length() - lastLength - replayLength) + result;
        }

        result += str.substring(str.length() - lastLength, str.length());

        return result;
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 对指定字符串进行解密
     * </ul>
     *
     * @param str          待解密字符串
     * @param lastLength   末尾保留长度
     * @param replayLength 要替换长度(从末尾保留的串向前替换)
     * @return 解密后字符串
     */
    private static String decode(String str, int lastLength, int replayLength) {
        if (str == null || str.trim().length() <= lastLength) {
            return str;
        }

        //获取手机号后四位在种子中对应的数字数组
        int[] seed = getLastSeeds(str, lastLength);

        //结果值
        String result = "";

        int j = lastLength - 1;

        if (str.length() - lastLength - replayLength < 0) {
            j = (str.length() - lastLength) % lastLength - 1;
        }
        //遍历将号码中的倒数第八位到倒数第四位的数进行加密并放到结果中
        for (int i = str.length() - lastLength - 1; i > str.length() - lastLength - replayLength - 1 && i >= 0; i--, j--) {
            String s = str.substring(i, i + 1);
            int n = Integer.parseInt(s, -1);
            if (n < 0) {
                result += s;
                if (j < 0) {
                    j = lastLength - 1;
                }
                continue;
            }

            if (j < 0) {
                j = lastLength - 1;
            }

            if (n < seed[j]) {
                n += 10;
            }
            result += n - seed[j];
        }

        //拼装号码的前半部分和后四位到结果中
        if (str.length() > lastLength + replayLength) {
            result = str.substring(0, str.length() - lastLength - replayLength) + result;
        }

        result += str.substring(str.length() - lastLength, str.length());

        return result;
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 获取最后的四位数对应的种子中的数字
     * </ul>
     *
     * @param str        传入的字符串
     * @param lastLength 生成替换串长度
     * @return
     */
    private static int[] getLastSeeds(String str, int lastLength) {
        int[] result = new int[lastLength];
        if (str == null || str.length() <= lastLength) {
            for (int i = 0; i < lastLength; i++) {
                result[i] = seeds[0];
            }
            return result;
        }

        for (int i = 0; i < lastLength; i++) {
            result[i] = seeds[Integer.parseInt(str.substring(str.length() - i - 1, str.length() - i), 0)];
        }
        return result;
    }

    /**
     * <b>方法说明：</b>
     * <ul>
     * 替换日志信息，避免敏感信息答应到日志中。
     * </ul>
     *
     * @param string 带处理字符串
     * @return 处理结果。
     */
    public static String replaceLogMsg(String string) {
        if (string == null) {
            return "";
        }
        String str = string.trim();
        int length = str.length();
        if (length <= 2) {
            return str;
        }
        int encodeLength = (int) (length * 0.4) + 1;
        int start = encodeLength / 2 + 1;
        int end = start + encodeLength;

        String k = "";
        for (int i = 0; i < encodeLength; i++) {
            k += "*";
        }
        return new StringBuffer(str).replace(start, end, k).toString();
    }

    public static void main(String args[]) {
//		String m = "13301244564545674676";
//		System.out.println(m);
//
//		String e = encodeIDCard(m);
//		System.out.println(e);
//
//		String d = decodeIDCard(e);
//		System.out.println(d);

//		for (int i = 0; i < 10; i++) {
//			System.out.println((char) i);
//		}

        String traceID = encodeSessionID("123654789");
        System.out.println(traceID);

        System.out.println(checkSessionID(traceID));
    }
}

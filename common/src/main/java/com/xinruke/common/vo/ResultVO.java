package com.xinruke.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName ResultVO
 * @CreateDate 2019/6/7
 * @Author FengXinQiang
 * @Version V1.0.0.0
 * @Decription 通用结果
 */
@ApiModel("通用结果")
public class ResultVO<T> {
    //成功
    public static final long SUCCESS = 1;
    //失败
    public static final long FAIL = -1;

    @ApiModelProperty("返回码，1：成功")
    private long code;
    @ApiModelProperty("返回信息")
    private String message;
    @ApiModelProperty(value = "返回数据")
    private T data;

    /**
     * @param code
     * @param message
     */
    public ResultVO(long code, String message) {
        this(code, message, null);
    }

    /**
     * @param code
     * @param message
     * @param data
     */
    public ResultVO(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * @return
     */
    public static ResultVO success() {
        return new ResultVO(SUCCESS, "SUCCESS");
    }

    /**
     * @return
     */
    public static ResultVO fail() {
        return new ResultVO(FAIL, "FAIL");
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

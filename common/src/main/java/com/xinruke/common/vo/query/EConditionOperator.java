package com.xinruke.common.vo.query;

/**
 * @ClassName EConditionOperator.java
 * @CreateDate 2019/6/8
 * @Author FengXinQiang
 * @Version V1.0.0.0
 * @Decription 查询条件操作符枚举
 */
public enum EConditionOperator {
    /** 相等 */
     EQULS("="),
    /** 模糊查询 */
    LIKE("like");

    private String value;

    private EConditionOperator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EConditionOperator parse(String value) {
        for (EConditionOperator e : EConditionOperator.values()) {
            if (e.getValue().equals(value)) {
                return e;
            }
        }
        return null;
    }
}

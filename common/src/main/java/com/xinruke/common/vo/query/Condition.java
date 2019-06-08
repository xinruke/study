package com.xinruke.common.vo.query;

/**
 * @ClassName Condition.java
 * @CreateDate 2019/6/8
 * @Author FengXinQiang
 * @Version V1.0.0.0
 * @Decription 查询条件对象
 */
public class Condition {
    /**
     * 字段
     */
    private String field;
    /**
     * 查询操作符：= like <= >=  is in
     */
    private EConditionOperator operator;
    /**
     * 值
     */
    private String value;
    /**
     * 数据类型：string date long
     */
    private String dataType;

    /**
     * 构造器
     *
     * @param field
     * @param operator
     * @param value
     */
    public Condition(String field, EConditionOperator operator, String value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public EConditionOperator getOperator() {
        return operator;
    }

    public void setOperator(EConditionOperator operator) {
        this.operator = operator;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

}

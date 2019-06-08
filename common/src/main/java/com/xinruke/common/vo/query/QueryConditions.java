package com.xinruke.common.vo.query;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName QueryConditions.java
 * @CreateDate 2019/6/8
 * @Author FengXinQiang
 * @Version V1.0.0.0
 * @Decription 查询条件集合
 */
public class QueryConditions {
    private List<Condition> conditionList = new ArrayList<Condition>();

    /**
     * 直接传入conditionList
     *
     * @param conditionList
     */
    public QueryConditions(List<Condition> conditionList) {
        this.conditionList = conditionList;
    }

    public QueryConditions() {
        super();
    }

    /**
     * 根据参数直接构造conditionList
     *
     * @param field
     * @param operator
     * @param value
     */
    public QueryConditions(String field, EConditionOperator operator, String value) {
        addCondition(field, operator, value);
    }

    public void addCondition(String field, EConditionOperator operator, String value) {
        conditionList.add(new Condition(field, operator, value));
    }

    /**
     * 移除指定查询字段
     *
     * @param field
     */
    public void removeCondition(String field) {
        for (int i = 0; i < conditionList.size(); i++) {
            Condition cond = (Condition) conditionList.get(i);
            if (cond.getField().equals(field)) {
                conditionList.remove(i);
            }
        }
    }

    /**
     * 移除指定字段和操作符的查询条件
     *
     * @param field
     * @param operator
     */
    public void removeCondition(String field, String operator) {
        for (int i = 0; i < conditionList.size(); i++) {
            Condition cond = (Condition) conditionList.get(i);
            if (cond.getField().equals(field) && cond.getOperator().equals(operator)) {
                conditionList.remove(i);
            }
        }
    }


    public Object getConditionValue(String field) {
        if (field == null)
            return null;
        for (int i = 0; i < conditionList.size(); i++) {
            Condition cond = (Condition) conditionList.get(i);
            if (field.equals(cond.getField()))
                return cond.getValue();
        }
        return null;
    }

    public Object getConditionValue(String field, String operator) {
        if (field == null || operator == null)
            return null;
        for (int i = 0; i < conditionList.size(); i++) {
            Condition cond = (Condition) conditionList.get(i);
            if (field.equals(cond.getField()) && operator.equals(cond.getOperator()))
                return cond.getValue();
        }
        return null;
    }

    /**
     * @return Returns the conditionList.
     */
    public List getConditionList() {
        return conditionList;
    }

    /**
     * @param conditionList The conditionList to set.
     */
    public void setConditionList(List conditionList) {
        this.conditionList = conditionList;
    }

}

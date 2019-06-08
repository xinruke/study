package com.xinruke.common.mybatis;

import com.xinruke.common.vo.query.Condition;
import com.xinruke.common.vo.query.EConditionOperator;
import com.xinruke.common.vo.query.OrderField;
import com.xinruke.common.vo.query.QueryConditions;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassName MyExample.java
 * @CreateDate 2019/6/8
 * @Author FengXinQiang
 * @Version V1.0.0.0
 * @Decription 自定义Example
 */
public class MyExample extends Example {
    public MyExample(Class<?> entityClass) {
        super(entityClass);
    }

    public MyExample(Class<?> entityClass, QueryConditions queryConditions, List<OrderField> orderFieldList) {
        super(entityClass);
        orderby(orderFieldList);
        dealCondition(queryConditions);
    }

    private void dealCondition(QueryConditions queryConditions) {
        Example.Criteria criteria = this.createCriteria();

        List<Condition> conditionList = queryConditions.getConditionList();
        if (conditionList != null && conditionList.size() > 0) {
            for (Condition condition : conditionList) {
                if (StringUtils.isEmpty(condition.getValue())) {
                    continue;
                }
                if (EConditionOperator.EQULS == condition.getOperator()) {
                    criteria.andEqualTo(condition.getField(), condition.getValue());
                } else if (EConditionOperator.LIKE == condition.getOperator()) {
                    criteria.andLike(condition.getField(), "%" + condition.getValue() + "%");
                }
            }
        }
    }

    /**
     * @param orderFieldList
     */
    private void orderby(List<OrderField> orderFieldList) {
        if (orderFieldList != null && orderFieldList.size() > 0) {
            for (OrderField orderField : orderFieldList) {
                String field = orderField.getOrderField();
                if (StringUtils.isEmpty(field)) {
                    continue;
                }
                if (orderField.isOrderDesc()) {
                    this.orderBy(orderField.getOrderField()).desc();
                } else {
                    this.orderBy(orderField.getOrderField()).asc();
                }
            }
        }
    }

}

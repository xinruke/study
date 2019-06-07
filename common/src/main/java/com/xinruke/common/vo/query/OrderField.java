package com.xinruke.common.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName OrderField.java
 * @CreateDate 2019/6/7
 * @Author FengXinQiang
 * @Version V1.0.0.0
 * @Decription 排序字段
 */
@ApiModel("排序字段")
public class OrderField {
    @ApiModelProperty("用来排序字段的别名")
    private String orderField;
    @ApiModelProperty("是否按降序排序")
    private boolean orderDesc;

    /**
     * 构造函数
     *
     * @param orderField
     * @param orderDesc
     */
    public OrderField(String orderField, boolean orderDesc) {
        this.orderField = orderField;
        this.orderDesc = orderDesc;
    }

    /**
     * @return Returns the orderDesc.
     */
    public boolean isOrderDesc() {
        return orderDesc;
    }

    /**
     * @param orderDesc The orderDesc to set.
     */
    public void setOrderDesc(boolean orderDesc) {
        this.orderDesc = orderDesc;
    }

    /**
     * @return Returns the orderField.
     */
    public String getOrderField() {
        return orderField;
    }

    /**
     * @param orderField The orderField to set.
     */
    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }


    public boolean getOrderDesc() {
        return orderDesc;
    }

}
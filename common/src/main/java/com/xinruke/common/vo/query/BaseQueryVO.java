package com.xinruke.common.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BaseQueryVO.java
 * @CreateDate 2019/6/7
 * @Author FengXinQiang
 * @Version V1.0.0.0
 * @Decription 基础查询
 */
@ApiModel("基础查询")
public class BaseQueryVO {
    @ApiModelProperty("每页记录数，默认20")
    private int pageSize = 20;

    @ApiModelProperty("当前页号，默认1")
    private int pageNo = 1;

    /**
     * 排序字段列表
     */
    private List<OrderField> orderFields = new ArrayList<OrderField>();

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public List<OrderField> getOrderFields() {
        return orderFields;
    }

    public void setOrderFields(List<OrderField> orderFields) {
        this.orderFields = orderFields;
    }
}

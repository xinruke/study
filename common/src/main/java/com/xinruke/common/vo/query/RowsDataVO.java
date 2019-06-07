package com.xinruke.common.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName RowsDataVO.java
 * @CreateDate 2019/6/7
 * @Author FengXinQiang
 * @Version V1.0.0.0
 * @Decription 数据集
 */
@ApiModel("数据集")
public class RowsDataVO<T> {
    @ApiModelProperty("总页数")
    private long totalPages;
    @ApiModelProperty("总记录数")
    private long totalRecords;
    @ApiModelProperty("行数据")
    private List<T> rows;

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}

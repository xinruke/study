package com.xinruke.user.dto;

import com.xinruke.common.vo.query.BaseQueryVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户信息查询")
public class UserInfoQueryDTO extends BaseQueryVO {
    @ApiModelProperty("用户名")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

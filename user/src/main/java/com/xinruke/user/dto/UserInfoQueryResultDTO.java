package com.xinruke.user.dto;

import com.xinruke.common.vo.query.RowsDataVO;
import com.xinruke.user.po.UserInfoPO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户信息查询")
public class UserInfoQueryResultDTO extends RowsDataVO {
    @ApiModelProperty("用户编号")
    private long id;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("登录密码")
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void transfer(UserInfoPO userInfoPO){
        this.setId(userInfoPO.getId());
        this.setName(userInfoPO.getName());
        this.setPassword(userInfoPO.getPassword());
    }
}

package com.xinruke.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@ApiModel("用户信息")
public class UserInfoVO {
    @ApiModelProperty("用户名")
    @NotBlank(message = "用户名不能为空")
    private String name;
    @ApiModelProperty("登录密码")
    @Length(min = 6,message = "最少6个字符")
    private String password;

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
}

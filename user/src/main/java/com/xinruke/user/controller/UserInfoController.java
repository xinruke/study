package com.xinruke.user.controller;

import com.xinruke.commoditystarter.service.CommodityService;
import com.xinruke.user.vo.UserInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user/info")
@Api("用户信息")
public class UserInfoController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CommodityService commodityService;

    @PostMapping("add")
    @ApiOperation("添加用户信息")
    public String addUserInfo(@RequestBody UserInfoVO userInfoVO) {
        logger.info("name[" + userInfoVO.getName() + "]password[" + userInfoVO.getPassword() + "]");

        String[] configs = commodityService.split(",");
        for (String config : configs) {
            logger.info("commodity-starter,config=" + config);
        }
        return userInfoVO.getName() + "-success";
    }
}

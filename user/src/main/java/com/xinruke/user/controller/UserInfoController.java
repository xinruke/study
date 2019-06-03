package com.xinruke.user.controller;

import com.xinruke.commoditystarter.service.CommodityService;
import com.xinruke.user.vo.UserInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/info")
@Api("用户信息")
public class UserInfoController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CommodityService commodityService;

    @PostMapping(value = "add" )
    @ApiOperation("添加用户信息")
    public String addUserInfo(@RequestBody @Validated UserInfoVO userInfoVO, BindingResult bindingResult) {
        logger.info("name[" + userInfoVO.getName() + "]password[" + userInfoVO.getPassword() + "]");
        String result = userInfoVO.getName() + "-success";

        /*String[] configs = commodityService.split(",");
        for (String config : configs) {
            logger.info("commodity-starter,config=" + config);
        }*/


        if (bindingResult.hasErrors()) {
            for (ObjectError objectError : bindingResult.getAllErrors()) {
                logger.error("BindingResult[" + objectError.getCodes()[0] + "=" + objectError.getDefaultMessage() + "]");
            }
            result = bindingResult.getAllErrors().get(0).getDefaultMessage();
        }
        return result;
    }
}

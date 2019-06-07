package com.xinruke.user.controller;

import com.xinruke.financeinterface.api.UserFinanceApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/finance")
@Api("用户资金")
public class UserFinanceController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserFinanceApi userFinanceApi;

    @GetMapping("balance")
    @ApiOperation("查询用户余额")
    public String balance(String userId) {
        String result = userFinanceApi.getBalance(userId);
        return result;
    }

    @GetMapping("balanceNative")
    @ApiOperation("查询本地用户余额")
    public String balanceNative(@RequestParam @ApiParam("用户代码") String userId) {
        logger.info("enter balance...");
        return userId + "=123.4";
    }

}

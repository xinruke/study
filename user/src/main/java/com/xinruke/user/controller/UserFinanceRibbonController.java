package com.xinruke.user.controller;

import com.xinruke.user.service.UserFinanceRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/finance/ribbon")
public class UserFinanceRibbonController {

    @Autowired
    UserFinanceRibbonService userFinanceRibbonService;

    @GetMapping("balance")
    public String balance(String userId) {
        String result = userFinanceRibbonService.getBalance(userId);
        return result;
    }
}

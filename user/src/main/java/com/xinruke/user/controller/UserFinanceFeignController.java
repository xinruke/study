package com.xinruke.user.controller;

import com.xinruke.user.service.UserFinanceFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/finance/feign")
public class UserFinanceFeignController {

    @Autowired
    UserFinanceFeignService userFinanceFeignService;

    @GetMapping("balance")
    public String balance(String userId) {
        String result = userFinanceFeignService.getBalance(userId);
        return result;
    }

}

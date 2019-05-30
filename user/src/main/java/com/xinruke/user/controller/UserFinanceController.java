package com.xinruke.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/finance")
public class UserFinanceController {

    @GetMapping("balance")
    public String balance(String userId) {

        return userId + "=123.4";
    }

}

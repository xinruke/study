package com.xinruke.finance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/finance")
public class UserFinanceController {

    @GetMapping("balance/{userId}")
    public String balance(@PathVariable String userId) {
        return userId + "=B12.30";
    }
}

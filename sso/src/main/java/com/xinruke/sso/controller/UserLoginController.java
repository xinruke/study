package com.xinruke.sso.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/login")
public class UserLoginController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("loginByParam")
    public String loginByParam(@RequestParam String name, @RequestParam String password) {
        logger.info("name[" + name + "]password[" + password + "]");

        return name + "-success";
    }
}

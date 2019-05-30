package com.xinruke.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user/login")
@CrossOrigin
public class UserLoginController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("loginByParam")
    public String login(@RequestParam String name, @RequestParam String password) {
        logger.info("name[" + name + "]password[" + password + "]");
        return name + "-success";
    }

}

package com.xinruke.sso.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login/validate")
public class LoginValidateController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("validateByName")
    public String validateByName(@RequestParam String name) {
        logger.info("name[" + name + "]");

        return "success";
    }
}

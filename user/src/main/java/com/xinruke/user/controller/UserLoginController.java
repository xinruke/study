package com.xinruke.user.controller;

import com.xinruke.commoditystarter.service.CommodityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user/login")
@CrossOrigin
public class UserLoginController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CommodityService commodityService;

    @GetMapping("loginByParam")
    public String login(@RequestParam String name, @RequestParam String password) {
        logger.info("name[" + name + "]password[" + password + "]");

        String[] configs = commodityService.split(",");
        for (String config : configs) {
            logger.info("commodity-starter,config=" + config);
        }
        return name + "-success";
    }

}

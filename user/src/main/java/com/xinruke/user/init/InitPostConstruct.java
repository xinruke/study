package com.xinruke.user.init;

import com.xinruke.user.service.UserLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitPostConstruct {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserLoginService userLoginService;

    private InitPostConstruct() {
        logger.info("[start sequence]PostConstruct,构造方法第一个执行........");
    }

    @PostConstruct
    private void init() {
        logger.info("[start sequence]PostConstruct,Bean注入第二个执行........userLoginService[" + userLoginService + "]");
        logger.info("[start sequence]PostConstruct,注解PostConstruct第三个执行........");
    }

}

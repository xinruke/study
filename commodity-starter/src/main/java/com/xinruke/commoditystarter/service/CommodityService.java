package com.xinruke.commoditystarter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class CommodityService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    private String config;

    public CommodityService(String config) {
        logger.info("commodity-starter,StarterService的构造方法，config[" + config + "]");
        this.config = config;
    }

    public String[] split(String separatorChar) {
        if (StringUtils.isEmpty(config)) {
            throw new RuntimeException("config is null");
        }

        return config.split(separatorChar);
    }
}

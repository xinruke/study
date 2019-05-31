package com.xinruke.commoditystarter.config;

import com.xinruke.commoditystarter.service.CommodityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(CommodityService.class) //当classpath下发现该类的情况下进行自动配置
@EnableConfigurationProperties(CommodityProperties.class)
public class CommodityAutoConfiguration {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean
    //当Spring Context中不存在该Bean时
    @ConditionalOnMissingBean
    //xinruke.commodity.enabled=true时
    @ConditionalOnProperty(prefix = "xinruke.commodity", value = "enabled", havingValue = "true")
    public CommodityService commodityService() {
        logger.info("commodity-starter,config[" + commodityProperties.getConfig() + "]");
        return new CommodityService(commodityProperties.getConfig());
    }

    @Autowired
    private CommodityProperties commodityProperties;
}

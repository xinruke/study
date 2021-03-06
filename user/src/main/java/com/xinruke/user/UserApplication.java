package com.xinruke.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.xinruke")
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients(basePackages = "com.xinruke")
@EnableScheduling
@MapperScan(basePackages = "com.xinruke.user.mapper")
public class UserApplication {
    static Logger logger = LoggerFactory.getLogger(UserApplication.class);

    public static void main(String[] args) {
        logger.info("[start sequence]main start......");

        SpringApplication.run(UserApplication.class, args);

        logger.info("[start sequence]main end......");

        logger.info("--------------------------");
        logger.info("----User Start Success----");
        logger.info("--------------------------");
    }
}

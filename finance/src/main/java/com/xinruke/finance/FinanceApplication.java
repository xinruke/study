package com.xinruke.finance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceApplication {

    static Logger logger = LoggerFactory.getLogger(FinanceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FinanceApplication.class, args);

        logger.info("--------------------------");
        logger.info("----Finance Start Success----");
        logger.info("--------------------------");
    }

}

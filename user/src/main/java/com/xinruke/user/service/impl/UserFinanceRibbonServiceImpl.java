package com.xinruke.user.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xinruke.user.service.UserFinanceRibbonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserFinanceRibbonServiceImpl implements UserFinanceRibbonService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RestTemplate balanceRestTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "getBalanceFallback")
    public String getBalance(String userId) {
        String result = balanceRestTemplate.getForObject("http://finance-service/user/finance/balance/" + userId, String.class);
        return result;
    }

    private String getBalanceFallback(String userId) {
        logger.error("调用远程服务finance-service失败，熔断getBalance方法");
        return "[Ribbon-fallback][getBalance] userId[" + userId + "]";
    }
}

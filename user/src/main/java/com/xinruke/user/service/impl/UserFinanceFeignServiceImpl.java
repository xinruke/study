package com.xinruke.user.service.impl;

import com.xinruke.user.service.UserFinanceFeignService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserFinanceFeignServiceImpl implements FallbackFactory<UserFinanceFeignService> {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public UserFinanceFeignService create(Throwable throwable) {
        logger.error("系统异常", throwable);

        return new UserFinanceFeignService() {
            @Override
            public String getBalance(String userId) {
                logger.error("调用远程服务finance-service失败，熔断getBalance方法");
                return "[Feign-fallback][getBalance] userId[" + userId + "]";
            }
        };
    }
}

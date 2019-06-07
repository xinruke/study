package com.xinruke.financeinterface.api;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserFinanceFallback implements FallbackFactory<UserFinanceApi> {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public UserFinanceApi create(Throwable throwable) {
        logger.error("系统异常", throwable);

        return new UserFinanceApi() {
            @Override
            public String getBalance(String userId) {
                logger.error("调用远程服务finance-service失败，熔断getBalance方法");
                return "[Feign-fallback][getBalance] userId[" + userId + "]";
            }
        };
    }
}

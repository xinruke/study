package com.xinruke.financeinterface.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "finance-service", fallbackFactory = UserFinanceFallback.class)
public interface UserFinanceApi {
    @GetMapping("/user/finance/balance/{userId}")
    public String getBalance(@PathVariable String userId);
}

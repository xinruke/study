package com.xinruke.user.service;

import com.xinruke.user.service.impl.UserFinanceFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "finance-service", fallbackFactory = UserFinanceFeignServiceImpl.class)
public interface UserFinanceFeignService {
    @GetMapping("/user/finance/balance/{userId}")
    public String getBalance(@PathVariable String userId);
}

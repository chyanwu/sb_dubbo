package com.chenyanwu.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chenyanwu.dubbo.api.service.ICostService;

/**
 * @Auther: chenyanwu
 * @Date: 2019/7/19 15:50
 * @Description:
 * @Version 1.0
 */
@Service
public class CostServiceImpl implements ICostService {
    private final Integer totalCost = 1000;

    @Override
    public Integer add(int cost) {
        return totalCost + cost;
    }
}

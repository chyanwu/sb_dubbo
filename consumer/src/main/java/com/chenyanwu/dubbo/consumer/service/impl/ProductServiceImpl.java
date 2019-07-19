package com.chenyanwu.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.chenyanwu.dubbo.api.service.ICostService;
import com.chenyanwu.dubbo.consumer.service.IProductService;

/**
 * @Auther: chenyanwu
 * @Date: 2019/7/19 15:42
 * @Description:  注意其中的@Server和@Reference都是基于dubbo的注解引入
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Reference
    private ICostService costService;

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}

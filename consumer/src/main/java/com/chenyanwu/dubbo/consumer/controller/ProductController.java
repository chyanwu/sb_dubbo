package com.chenyanwu.dubbo.consumer.controller;

import com.chenyanwu.dubbo.consumer.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: chenyanwu
 * @Date: 2019/7/19 15:44
 * @Description:
 * @Version 1.0
 */
@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @RequestMapping("/add")
    public String getCost(int a) {
        return "该产品总共消费：" + productService.getCost(a);
    }

}

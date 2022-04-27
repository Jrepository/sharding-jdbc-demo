package com.indi.order.controller;


import com.indi.order.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ph
 * @since 2022-04-25
 */
@RestController
@RequestMapping("/order/orders")
public class OrdersController {

    @Autowired
    IOrdersService ordersService;

    @GetMapping("/list")
    public Object list() {
        return ordersService.list();
    }


    @GetMapping("/save")
    public boolean saveOrder() {
        return ordersService.saveOrUpdateOrder();
    }

}

package com.indi.order.service;

import com.indi.order.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;
import com.indi.order.entity.Orders;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ph
 * @since 2022-04-25
 */
public interface IOrdersService extends IService<Orders> {

    boolean saveOrUpdateOrder();
}

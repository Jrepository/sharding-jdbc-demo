package com.indi.order.service.impl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.indi.order.entity.Orders;
import com.indi.order.mapper.OrdersMapper;
import com.indi.order.service.IOrdersService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ph
 * @since 2022-04-25
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

    @Override
    public boolean saveOrUpdateOrder() {

        List<Orders> orderList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Orders orders = Orders.builder()
                    .userId(i)
                    .productId(i)
                    .payAmount(new BigDecimal(i))
                    .addTime(LocalDateTime.now())
                    .lastUpdateTime(LocalDateTime.now())
                    .build();
            orderList.add(orders);
        }

      return  this.saveOrUpdateBatch(orderList);

    }
}

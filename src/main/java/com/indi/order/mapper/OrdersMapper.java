package com.indi.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.indi.order.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ph
 * @since 2022-04-25
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

}

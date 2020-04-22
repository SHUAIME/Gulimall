package com.yan.gulimall.order.dao;

import com.yan.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author shuaime
 * @email yshuaime@163.com
 * @date 2020-04-22 15:51:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

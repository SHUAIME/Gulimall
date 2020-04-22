package com.yan.gulimall.coupon.dao;

import com.yan.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author shuaime
 * @email yshuaime@163.com
 * @date 2020-04-22 15:24:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

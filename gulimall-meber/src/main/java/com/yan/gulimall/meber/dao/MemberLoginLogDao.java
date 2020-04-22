package com.yan.gulimall.meber.dao;

import com.yan.gulimall.meber.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author shuaime
 * @email yshuaime@163.com
 * @date 2020-04-22 15:42:32
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}

package com.yan.gulimall.meber.dao;

import com.yan.gulimall.meber.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author shuaime
 * @email yshuaime@163.com
 * @date 2020-04-22 15:42:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

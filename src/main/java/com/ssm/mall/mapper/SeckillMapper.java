package com.ssm.mall.mapper;

import com.ssm.mall.pojo.Seckill;
import com.ssm.mall.pojo.SeckillExample;
import java.util.List;

public interface SeckillMapper {
    int deleteByPrimaryKey(Integer seckill_id);

    int insert(Seckill record);

    int insertSelective(Seckill record);

    List<Seckill> selectByExample(SeckillExample example);

    Seckill selectByPrimaryKey(Integer seckill_id);

    int updateByPrimaryKeySelective(Seckill record);

    int updateByPrimaryKey(Seckill record);
}
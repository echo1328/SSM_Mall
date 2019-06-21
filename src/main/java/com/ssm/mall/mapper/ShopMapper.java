package com.ssm.mall.mapper;

import com.ssm.mall.pojo.Shop;
import com.ssm.mall.pojo.ShopExample;
import java.util.List;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer shop_id);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Integer shop_id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}
package com.ssm.mall.mapper;

import com.ssm.mall.pojo.Seller;
import com.ssm.mall.pojo.SellerExample;
import java.util.List;

public interface SellerMapper {
    int deleteByPrimaryKey(Integer seller_id);

    int insert(Seller record);

    int insertSelective(Seller record);

    List<Seller> selectByExample(SellerExample example);

    Seller selectByPrimaryKey(Integer seller_id);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}
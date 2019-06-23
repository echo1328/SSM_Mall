package com.ssm.mall.mapper;

import com.ssm.mall.pojo.Address;
import com.ssm.mall.pojo.AddressExample;
import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer address_id);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressExample example);

    Address selectByPrimaryKey(Integer address_id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}
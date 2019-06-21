package com.ssm.mall.mapper;

import com.ssm.mall.pojo.MyOrder;
import com.ssm.mall.pojo.MyOrderExample;
import java.util.List;

public interface MyOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MyOrder record);

    int insertSelective(MyOrder record);

    List<MyOrder> selectByExample(MyOrderExample example);

    MyOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MyOrder record);

    int updateByPrimaryKey(MyOrder record);
}
package com.ssm.mall.mapper;

import com.ssm.mall.pojo.Car;
import com.ssm.mall.pojo.CarExample;
import java.util.List;

public interface CarMapper {
    int deleteByPrimaryKey(Integer car_id);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(Integer car_id);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}
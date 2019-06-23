package com.ssm.mall.mapper;

import com.ssm.mall.pojo.Areas;
import com.ssm.mall.pojo.AreasExample;
import java.util.List;

public interface AreasMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Areas record);

    int insertSelective(Areas record);

    List<Areas> selectByExample(AreasExample example);

    Areas selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Areas record);

    int updateByPrimaryKey(Areas record);
}
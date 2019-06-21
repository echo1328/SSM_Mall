package com.ssm.mall.mapper;

import com.ssm.mall.pojo.AdType;
import com.ssm.mall.pojo.AdTypeExample;
import java.util.List;

public interface AdTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdType record);

    int insertSelective(AdType record);

    List<AdType> selectByExample(AdTypeExample example);

    AdType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdType record);

    int updateByPrimaryKey(AdType record);
}
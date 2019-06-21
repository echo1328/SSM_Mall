package com.ssm.mall.mapper;

import com.ssm.mall.pojo.AdContent;
import com.ssm.mall.pojo.AdContentExample;
import java.util.List;

public interface AdContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdContent record);

    int insertSelective(AdContent record);

    List<AdContent> selectByExample(AdContentExample example);

    AdContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdContent record);

    int updateByPrimaryKey(AdContent record);
}
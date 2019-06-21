package com.ssm.mall.mapper;

import com.ssm.mall.pojo.Sort;
import com.ssm.mall.pojo.SortExample;
import java.util.List;

public interface SortMapper {
    int deleteByPrimaryKey(Integer sort_id);

    int insert(Sort record);

    int insertSelective(Sort record);

    List<Sort> selectByExample(SortExample example);

    Sort selectByPrimaryKey(Integer sort_id);

    int updateByPrimaryKeySelective(Sort record);

    int updateByPrimaryKey(Sort record);
}
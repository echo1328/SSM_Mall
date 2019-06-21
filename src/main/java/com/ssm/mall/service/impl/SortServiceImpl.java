package com.ssm.mall.service.impl;

import com.ssm.mall.mapper.SortMapper;
import com.ssm.mall.pojo.Sort;
import com.ssm.mall.pojo.SortExample;
import com.ssm.mall.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortServiceImpl implements SortService {

    @Autowired
    private SortMapper sortMapper;

    @Override
    public List<Sort> findByParentId(int parent_id) {
        SortExample example = new SortExample();
        SortExample.Criteria criteria = example.createCriteria();
        criteria.andParent_idEqualTo(parent_id);
        return sortMapper.selectByExample(example);
    }

    @Override
    public List<Sort> findAll() {
        return sortMapper.selectByExample(null);
    }

    @Override
    public void add(Sort sort) {
        sortMapper.insert(sort);
    }

    @Override
    public Sort findOne(int id) {
        return sortMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Sort sort) {
        sortMapper.updateByPrimaryKey(sort);
    }

    @Override
    public void delete(int id) {
        sortMapper.deleteByPrimaryKey(id);
    }

}

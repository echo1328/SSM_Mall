package com.ssm.mall.service.impl;

import com.ssm.mall.mapper.AreasMapper;
import com.ssm.mall.mapper.ProvincesMapper;
import com.ssm.mall.pojo.Areas;
import com.ssm.mall.pojo.AreasExample;
import com.ssm.mall.pojo.Provinces;
import com.ssm.mall.service.AreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SSM_Mall
 * @description: AreasServiceImpl
 * @author: wenlongzhou
 * @create: 2019-06-23 11:19
 **/

@Service
public class AreasServiceImpl implements AreasService {

    @Autowired
    private AreasMapper areasMapper;

    @Override
    public List<Areas> finAll() {
        return areasMapper.selectByExample(null);
    }

    @Override
    public List<Areas> findAllByCitiesId(String id) {
        AreasExample example = new AreasExample();
        AreasExample.Criteria criteria = example.createCriteria();
        criteria.andCityidEqualTo(id);
        return areasMapper.selectByExample(example);
    }

}

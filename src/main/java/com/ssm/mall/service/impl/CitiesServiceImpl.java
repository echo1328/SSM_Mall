package com.ssm.mall.service.impl;

import com.ssm.mall.mapper.CitiesMapper;
import com.ssm.mall.mapper.ProvincesMapper;
import com.ssm.mall.pojo.Cities;
import com.ssm.mall.pojo.CitiesExample;
import com.ssm.mall.pojo.Provinces;
import com.ssm.mall.service.CitiesService;
import com.ssm.mall.service.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SSM_Mall
 * @description: CitiesServiceImpl
 * @author: wenlongzhou
 * @create: 2019-06-23 11:19
 **/

@Service
public class CitiesServiceImpl implements CitiesService {

    @Autowired
    private CitiesMapper citiesMapper;

    @Override
    public List<Cities> findAll() {
        return citiesMapper.selectByExample(null);
    }

    @Override
    public List<Cities> findAllByProvincesId(String id) {
        CitiesExample example = new CitiesExample();
        CitiesExample.Criteria criteria = example.createCriteria();
        criteria.andProvinceidEqualTo(id);
        return citiesMapper.selectByExample(example);
    }

}

package com.ssm.mall.service.impl;

import com.ssm.mall.mapper.ProvincesMapper;
import com.ssm.mall.pojo.Provinces;
import com.ssm.mall.service.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SSM_Mall
 * @description: ProvincesServiceImpl
 * @author: wenlongzhou
 * @create: 2019-06-23 11:19
 **/

@Service
public class ProvincesServiceImpl implements ProvincesService {

    @Autowired
    private ProvincesMapper provincesMapper;

    @Override
    public List<Provinces> finAll() {
        return provincesMapper.selectByExample(null);
    }

}

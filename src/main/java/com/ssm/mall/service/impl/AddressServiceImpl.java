package com.ssm.mall.service.impl;

import com.ssm.mall.mapper.AddressMapper;
import com.ssm.mall.pojo.Address;
import com.ssm.mall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: SSM_Mall
 * @description: AddressServiceImpl
 * @author: wenlongzhou
 * @create: 2019-06-23 15:05
 **/

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public void add(Address address) {
        addressMapper.insert(address);
    }

}

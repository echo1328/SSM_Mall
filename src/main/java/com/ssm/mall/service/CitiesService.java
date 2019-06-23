package com.ssm.mall.service;

import com.ssm.mall.pojo.Cities;
import com.ssm.mall.pojo.Provinces;

import java.util.List;

public interface CitiesService {

    public List<Cities> findAll();

    public List<Cities> findAllByProvincesId(String id);

}

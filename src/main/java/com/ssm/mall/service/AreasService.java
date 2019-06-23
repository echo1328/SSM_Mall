package com.ssm.mall.service;

import com.ssm.mall.pojo.Areas;
import com.ssm.mall.pojo.Provinces;

import java.util.List;

public interface AreasService {

    public List<Areas> finAll();

    public List<Areas> findAllByCitiesId(String id);

}

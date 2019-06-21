package com.ssm.mall.service;

import com.ssm.mall.pojo.AdType;
import entity.PageResult;

import java.util.List;

public interface AdTypeService {

    public List<AdType> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public AdType findOne(int id);

    public void delete(int id);

    public void delete(int[] ids);

    public void add(AdType adType);

    public void update(AdType adType);

}

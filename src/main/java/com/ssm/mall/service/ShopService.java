package com.ssm.mall.service;

import com.ssm.mall.pojo.Shop;
import entity.PageResult;

import java.util.List;

public interface ShopService {

    public List<Shop> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public Shop findOne(int id);

    public void add(Shop shop);

    public void update(Shop shop);

    public void delete(int id);

    public void delete(int[] ids);

}

package com.ssm.mall.service;

import com.ssm.mall.pojo.Goods;
import entity.PageResult;

import java.util.List;

public interface GoodsService {

    public List<Goods> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public void add(Goods goods);

    public Goods findOne(int id);

    public List<Goods> find(String key);

    public void update(Goods goods);

    public void delete(int id);

    public void delete(int[] ids);

}

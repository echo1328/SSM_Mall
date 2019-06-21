package com.ssm.mall.service;

import com.ssm.mall.pojo.Seckill;
import entity.PageResult;

import java.util.List;

public interface SeckillService {

    public List<Seckill> findList();

    public PageResult findPage(int pageNum, int pageSize);

    public Seckill findOneFromRedis(int id);

    public void submitOrder(int id, String user_name);

}

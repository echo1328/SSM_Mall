package com.ssm.mall.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssm.mall.mapper.ShopMapper;
import com.ssm.mall.pojo.Shop;
import com.ssm.mall.service.ShopService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/13 15:10
 */

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> findAll() {
        return shopMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Shop> page = (Page<Shop>) shopMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public Shop findOne(int id) {
        return shopMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Shop shop) {
        shopMapper.insert(shop);
    }

    @Override
    public void update(Shop shop) {
        shopMapper.updateByPrimaryKey(shop);
    }

    @Override
    public void delete(int id) {
        shopMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            shopMapper.deleteByPrimaryKey(id);
        }
    }

}

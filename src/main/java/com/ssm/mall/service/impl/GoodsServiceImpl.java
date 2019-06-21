package com.ssm.mall.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssm.mall.mapper.GoodsMapper;
import com.ssm.mall.pojo.Goods;
import com.ssm.mall.pojo.GoodsExample;
import com.ssm.mall.service.GoodsService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll() {
        return goodsMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<Goods> page = (Page<Goods>) goodsMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void add(Goods goods) {
        goods.setStatus(0);
        goodsMapper.insertSelective(goods);
    }

    @Override
    public Goods findOne(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Goods> find(String key) {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike("%" + key + "%");
        return  goodsMapper.selectByExample(example);
    }

    @Override
    public void update(Goods goods) {
        goodsMapper.updateByPrimaryKey(goods);
    }

    @Override
    public void delete(int id) {
        goodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delete(int[] ids) {
        for (int i = 0; i < ids.length; i++) {
            goodsMapper.deleteByPrimaryKey(ids[i]);
        }
    }

}

package com.ssm.mall.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssm.mall.mapper.AdContentMapper;
import com.ssm.mall.pojo.AdContent;
import com.ssm.mall.pojo.AdContentExample;
import com.ssm.mall.service.AdContentService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/5/31 10:41
 */

@Service
public class AdContentServiceImpl implements AdContentService {

    @Autowired
    private AdContentMapper adContentMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<AdContent> findAll() {
        return adContentMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<AdContent> page = (Page<AdContent>) adContentMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public AdContent findOne(int id) {
        return adContentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(int id) {
        //清除缓存
        int type_id = adContentMapper.selectByPrimaryKey(id).getType_id();
        redisTemplate.boundHashOps("content").delete(type_id);
        adContentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            //清除缓存
            int type_id = adContentMapper.selectByPrimaryKey(id).getType_id();
            redisTemplate.boundHashOps("content").delete(type_id);
            adContentMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void add(AdContent adContent) {
        adContentMapper.insert(adContent);
        //清除缓存
        redisTemplate.boundHashOps("content").delete(adContent.getType_id());
    }

    @Override
    public void update(AdContent adContent) {
        //查询原来的分组ID
        int type_id = adContentMapper.selectByPrimaryKey(adContent.getId()).getType_id();
        //清除原分组缓存
        redisTemplate.boundHashOps("content").delete(type_id);
        adContentMapper.updateByPrimaryKey(adContent);
        //清除现分组缓存
        if (type_id != adContent.getType_id()) {
            redisTemplate.boundHashOps("content").delete(adContent.getType_id());
        }
        System.out.println("清除缓存");
    }

    @Override
    public List<AdContent> findByAdType(int type_id) {
        List<AdContent> list = (List<AdContent>) redisTemplate.boundHashOps("content").get(type_id);
        if (list == null) {
            System.out.println("从数据库中查询数据并放入缓存");
            AdContentExample example = new AdContentExample();
            AdContentExample.Criteria criteria = example.createCriteria();
            criteria.andType_idEqualTo(type_id);
            criteria.andStatusEqualTo(1);
            //排序
            example.setOrderByClause("sort_id");
            list = adContentMapper.selectByExample(example);
            System.out.println(list);
            redisTemplate.boundHashOps("content").put(type_id, list);
        } else {
            System.out.println("从缓存中查询数据");
        }
        return list;
    }

}

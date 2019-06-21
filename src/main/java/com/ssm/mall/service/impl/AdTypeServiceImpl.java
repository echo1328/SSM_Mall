package com.ssm.mall.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssm.mall.mapper.AdTypeMapper;
import com.ssm.mall.pojo.AdType;
import com.ssm.mall.pojo.Brand;
import com.ssm.mall.service.AdTypeService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/5/31 9:26
 */

@Service
public class AdTypeServiceImpl implements AdTypeService {

    @Autowired
    private AdTypeMapper adTypeMapper;

    @Override
    public List<AdType> findAll() {
        return adTypeMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<AdType> page = (Page<AdType>) adTypeMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public AdType findOne(int id) {
        return adTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(int id) {
        adTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            adTypeMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void add(AdType adType) {
        adTypeMapper.insert(adType);
    }

    @Override
    public void update(AdType adType) {
        adTypeMapper.updateByPrimaryKey(adType);
    }

}

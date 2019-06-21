package com.ssm.mall.service;

import com.ssm.mall.pojo.AdContent;
import entity.PageResult;

import java.util.List;

public interface AdContentService {

    public List<AdContent> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public AdContent findOne(int id);

    public void delete(int id);

    public void delete(int[] ids);

    public void add(AdContent adContent);

    public void update(AdContent adContent);

    public List<AdContent> findByAdType(int type_id);

}

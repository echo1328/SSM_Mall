package com.ssm.mall.service;

import com.ssm.mall.pojo.Sort;

import java.util.List;

public interface SortService {

    public List<Sort> findByParentId(int parent_id);

    public List<Sort> findAll();

    public void add(Sort sort);

    public Sort findOne(int id);

    public void update(Sort sort);

    public void delete(int id);

}

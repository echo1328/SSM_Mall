package com.ssm.mall.service;

import com.ssm.mall.pojo.Seller;
import entity.PageResult;

import java.util.List;

public interface SellerService {

    public List<Seller> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public Seller findOne(int id);

    public void delete(int id);

    public void delete(int[] ids);

    public void update(Seller seller);

}

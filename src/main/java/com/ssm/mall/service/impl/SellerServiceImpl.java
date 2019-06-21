package com.ssm.mall.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssm.mall.mapper.SellerMapper;
import com.ssm.mall.mapper.ShopMapper;
import com.ssm.mall.mapper.UserMapper;
import com.ssm.mall.pojo.Seller;
import com.ssm.mall.pojo.SellerExample;
import com.ssm.mall.pojo.Shop;
import com.ssm.mall.pojo.User;
import com.ssm.mall.service.SellerService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/13 19:46
 */

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerMapper sellerMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Seller> findAll() {
        List<Seller> list1 = sellerMapper.selectByExample(null);
        List<Seller> list2 = new ArrayList<>();
        for (Seller seller : list1) {
            List<Shop> shopList = new ArrayList<>();
            int user_id = seller.getUser_id();
            User user = userMapper.selectByPrimaryKey(user_id);
            seller.setUser(user);
            String shop_ids = seller.getShop_ids();
            String[] ids = shop_ids.split(",");
            for (String id : ids) {
                int shop_id = Integer.parseInt(id);
                Shop shop = shopMapper.selectByPrimaryKey(shop_id);
                shopList.add(shop);
            }
            seller.setShopList(shopList);
            list2.add(seller);
        }
        return list2;
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<Seller> page = (Page<Seller>) sellerMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public Seller findOne(int id) {
        SellerExample example = new SellerExample();
        SellerExample.Criteria criteria = example.createCriteria();
        criteria.andSeller_idEqualTo(id);
        List<Seller> sellerList = sellerMapper.selectByExample(example);
        Seller seller = sellerList.get(0);
        List<Shop> shopList = new ArrayList<>();
        int user_id = seller.getUser_id();
        User user = userMapper.selectByPrimaryKey(user_id);
        seller.setUser(user);
        String shop_ids = seller.getShop_ids();
        String[] ids = shop_ids.split(",");
        for (String str : ids) {
            int shop_id = Integer.parseInt(str);
            Shop shop = shopMapper.selectByPrimaryKey(shop_id);
            shopList.add(shop);
        }
        seller.setShopList(shopList);
        return seller;
    }

    @Override
    public void delete(int id) {
        sellerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            sellerMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void update(Seller seller) {
        sellerMapper.updateByPrimaryKey(seller);
    }

}

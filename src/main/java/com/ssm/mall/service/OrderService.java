package com.ssm.mall.service;

import com.ssm.mall.pojo.Order;

import java.util.List;

public interface OrderService {

    public void addGoodsToOrderList(String user_name);

    public List<Order> findOrderList(String user_name);

    public void add();

}

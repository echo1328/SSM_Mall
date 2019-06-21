package com.ssm.mall.service;

import com.ssm.mall.pojo.MyOrder;

import java.util.List;

public interface MyOrderService {

    public List<MyOrder> findMyOrderList(String user_name);

    public List<MyOrder> findMyOrderListWithState(String user_name, int state);

    public void add(MyOrder myOrder);

}

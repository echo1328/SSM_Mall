package com.ssm.mall.service.impl;

import com.ssm.mall.mapper.GoodsMapper;
import com.ssm.mall.mapper.MyOrderMapper;
import com.ssm.mall.mapper.OrderMapper;
import com.ssm.mall.mapper.UserMapper;
import com.ssm.mall.pojo.*;
import com.ssm.mall.service.MyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/10 21:39
 */

@Service
public class MyOrderServiceImpl implements MyOrderService {

    @Autowired
    private MyOrderMapper myOrderMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public void add(MyOrder myOrder) {
        List<Goods> goodsList = new ArrayList<>();
        UserExample userExample = new UserExample();
        UserExample.Criteria userCriteria = userExample.createCriteria();
        userCriteria.andUser_nameEqualTo(myOrder.getUser_name());
        List<User> userList = userMapper.selectByExample(userExample);
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria orderCriteria = orderExample.createCriteria();
        orderCriteria.andUser_idEqualTo(userList.get(0).getUser_id()).andStateEqualTo(0);
        List<Order> orderList = orderMapper.selectByExample(orderExample);
        List<Integer> orders = new ArrayList<>();
        for (Order order : orderList) {
            orders.add(order.getOrder_id());
            order.setState(1);
            orderMapper.updateByPrimaryKey(order);
        }
        myOrder.setState(0);
        String str = orders.toString();
        myOrder.setOrders_ids(str.substring(1, str.length()-1));
        myOrderMapper.insert(myOrder);
    }

    @Override
    public List<MyOrder> findMyOrderList(String user_name) {
        MyOrderExample example = new MyOrderExample();
        MyOrderExample.Criteria criteria = example.createCriteria();
        criteria.andUser_nameEqualTo(user_name);
        List<MyOrder> myOrderList1 = myOrderMapper.selectByExample(example);
        List<MyOrder> myOrderList2 = new ArrayList<>();
        for (MyOrder myOrder : myOrderList1) {
            List<Goods> goodsList = new ArrayList<>();
            String str = myOrder.getOrders_ids();
            String[] arr = str.split(",");
            for (String s : arr) {
                int id = Integer.parseInt(s.trim());
                Order order = orderMapper.selectByPrimaryKey(id);
                Goods goods = goodsMapper.selectByPrimaryKey(order.getGoods_id());
                goods.setOrder_amount(order.getAmount());
                goodsList.add(goods);
            }
            myOrder.setGoodsList(goodsList);
            myOrderList2.add(myOrder);
        }
        return myOrderList2;
    }

    @Override
    public List<MyOrder> findMyOrderListWithState(String user_name, int state) {
        MyOrderExample example = new MyOrderExample();
        MyOrderExample.Criteria criteria = example.createCriteria();
        criteria.andUser_nameEqualTo(user_name);
        criteria.andStateEqualTo(state);
        List<MyOrder> myOrderList1 = myOrderMapper.selectByExample(example);
        List<MyOrder> myOrderList2 = new ArrayList<>();
        for (MyOrder myOrder : myOrderList1) {
            List<Goods> goodsList = new ArrayList<>();
            String str = myOrder.getOrders_ids();
            String[] arr = str.split(",");
            for (String s : arr) {
                int id = Integer.parseInt(s.trim());
                Order order = orderMapper.selectByPrimaryKey(id);
                Goods goods = goodsMapper.selectByPrimaryKey(order.getGoods_id());
                goods.setOrder_amount(order.getAmount());
                goodsList.add(goods);
            }
            myOrder.setGoodsList(goodsList);
            myOrderList2.add(myOrder);
        }
        return myOrderList2;
    }

}

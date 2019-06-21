package com.ssm.mall.service.impl;

import com.ssm.mall.mapper.CarMapper;
import com.ssm.mall.mapper.GoodsMapper;
import com.ssm.mall.mapper.OrderMapper;
import com.ssm.mall.mapper.UserMapper;
import com.ssm.mall.pojo.*;
import com.ssm.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/3 19:09
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private CarMapper carMapper;

    @Override
    public void addGoodsToOrderList(String user_name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andUser_nameEqualTo(user_name);
        List<User> userList = userMapper.selectByExample(userExample);
        CarExample carExample = new CarExample();
        CarExample.Criteria criteria2 = carExample.createCriteria();
        criteria2.andUser_idEqualTo(userList.get(0).getUser_id());
        List<Car> carList = carMapper.selectByExample(carExample);
        for (Car car : carList) {
            if (car.getIs_click() == 1) {
                Order order = new Order();
                order.setUser_id(userList.get(0).getUser_id());
                order.setGoods_id(car.getGoods_id());
                order.setAmount(car.getAmount());
                order.setState(0);
                orderMapper.insert(order);
                carMapper.deleteByPrimaryKey(car.getCar_id());
            }
        }
    }

    @Override
    public List<Order> findOrderList(String user_name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andUser_nameEqualTo(user_name);
        List<User> userList = userMapper.selectByExample(userExample);
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria2 = orderExample.createCriteria();
        criteria2.andUser_idEqualTo(userList.get(0).getUser_id()).andStateEqualTo(0);
        List<Order> orderList1 = orderMapper.selectByExample(orderExample);
        List<Order> orderList2 = new ArrayList<>();
        for (Order order : orderList1) {
            Goods goods = goodsMapper.selectByPrimaryKey(order.getGoods_id());
            order.setGoods(goods);
            orderList2.add(order);
        }
        return orderList2;
    }

    @Override
    public void add() {
        Order order = new Order();
        order.setUser_id(1);
        order.setGoods_id(11);
        order.setAmount(2);
        System.out.println(order);
        orderMapper.insertSelective(order);
    }

}

package com.ssm.mall.controller;

import com.ssm.mall.pojo.Order;
import com.ssm.mall.service.OrderService;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/3 19:16
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/addGoodsToOrderList")
    public Result addGoodsToOrderList(String user_name) {
        try {
            orderService.addGoodsToOrderList(user_name);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    @RequestMapping("/findOrderList")
    public List<Order> findOrderList(String user_name) {
        return orderService.findOrderList(user_name);
    }

    @RequestMapping("/add")
    public void add() {
        orderService.add();
    }

}

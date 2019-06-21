package com.ssm.mall.controller;

import com.ssm.mall.pojo.MyOrder;
import com.ssm.mall.service.MyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/10 22:03
 */

@RestController
@RequestMapping("/myorder")
public class MyOrderController {

    @Autowired
    private MyOrderService myOrderService;

    @RequestMapping("/findMyOrderList")
    public List<MyOrder> findMyOrderList(String user_name) {
        return myOrderService.findMyOrderList(user_name);
    }

    @RequestMapping("/findMyOrderListWithState")
    public List<MyOrder> findMyOrderListWithState(String user_name, int state) {
        return myOrderService.findMyOrderListWithState(user_name, state);
    }

}

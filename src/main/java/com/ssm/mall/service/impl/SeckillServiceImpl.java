package com.ssm.mall.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssm.mall.mapper.SeckillMapper;
import com.ssm.mall.mapper.UserMapper;
import com.ssm.mall.pojo.*;
import com.ssm.mall.service.SeckillService;
import entity.PageResult;
import org.omg.SendingContext.RunTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/16 9:20
 */

@Service
public class SeckillServiceImpl implements SeckillService {

    @Autowired
    private SeckillMapper seckillMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<Seckill> findList() {
        List<Seckill> seckillList = redisTemplate.boundHashOps("seckillGoods").values();
        if (seckillList == null || seckillList.size() == 0) {
            SeckillExample example = new SeckillExample();
            SeckillExample.Criteria criteria = example.createCriteria();
            criteria.andStatusEqualTo(1);
            criteria.andReserveGreaterThan(0);
            criteria.andStart_timeLessThanOrEqualTo(new Date());
            criteria.andEnd_timeGreaterThanOrEqualTo(new Date());
            seckillList = seckillMapper.selectByExample(example);
            for (Seckill seckill : seckillList) {
                redisTemplate.boundHashOps("seckillGoods").put(seckill.getSeckill_id(), seckill);
            }
            System.out.println("存入缓存");
        } else {
            System.out.println("从缓存读取");
        }
        List<Seckill> list = new ArrayList<>();
        Collections.shuffle(seckillList);
        Collections.shuffle(seckillList);
        Collections.shuffle(seckillList);
        list.add(seckillList.get(0));
        list.add(seckillList.get(1));
        list.add(seckillList.get(2));
        return list;
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        SeckillExample example = new SeckillExample();
        SeckillExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        criteria.andReserveGreaterThan(0);
        criteria.andStart_timeLessThanOrEqualTo(new Date());
        criteria.andEnd_timeGreaterThanOrEqualTo(new Date());
        Page<Seckill> page = (Page<Seckill>) seckillMapper.selectByExample(example);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public Seckill findOneFromRedis(int id) {
        return (Seckill) redisTemplate.boundHashOps("seckillGoods").get(id);
    }

    @Override
    public void submitOrder(int id, String user_name) {
        Seckill seckill = (Seckill) redisTemplate.boundHashOps("seckillGoods").get(id);
        if (seckill == null) {
            throw new RuntimeException("商品不存在");
        }
        if (seckill.getReserve() <= 0) {
            throw new RuntimeException("商品已抢购完");
        }
        seckill.setReserve(seckill.getReserve() - 1);
        redisTemplate.boundHashOps("seckillGoods").put(id,seckill);
        if (seckill.getReserve() == 0) {
            seckillMapper.updateByPrimaryKey(seckill);
            redisTemplate.boundHashOps("seckillGoods").delete(id);
        }
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUser_nameEqualTo(user_name);
        List<User> list = userMapper.selectByExample(example);
        Order order = new Order();
        order.setUser_id(list.get(0).getUser_id());
        order.setGoods_id(seckill.getGoods_id());
        order.setAmount(1);
        order.setState(0);
        redisTemplate.boundHashOps("seckillOrder").put(user_name, order);
        MyOrder myOrder = new MyOrder();
        myOrder.setOrder_name(seckill.getName());
        myOrder.setUser_name(user_name);
        myOrder.setOrder_num("" + (int)(Math.random() * 1999999999 + 1000000000));
        myOrder.setTotal_price(seckill.getPrice_after());
        myOrder.setTotal_amount(1);
        myOrder.setIntroduction("秒杀订单");
        myOrder.setState(0);
        redisTemplate.boundHashOps("seckillMyOrder").put(user_name, myOrder);
    }

}

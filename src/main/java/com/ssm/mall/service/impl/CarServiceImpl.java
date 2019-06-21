package com.ssm.mall.service.impl;

import com.ssm.mall.mapper.CarMapper;
import com.ssm.mall.mapper.GoodsMapper;
import com.ssm.mall.mapper.UserMapper;
import com.ssm.mall.pojo.*;
import com.ssm.mall.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/2 19:40
 */

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addGoodsToCarList(int goods_id, int amount, String user_name) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUser_nameEqualTo(user_name);
        List<User> list = userMapper.selectByExample(example);
        Car car = new Car();
        car.setUser_id(list.get(0).getUser_id());
        car.setGoods_id(goods_id);
        car.setAmount(amount);
        car.setIs_click(-1);
        System.out.println(car);
        carMapper.insert(car);
    }

    @Override
    public List<Car> findCarList(String user_name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andUser_nameEqualTo(user_name);
        List<User> userList = userMapper.selectByExample(userExample);
        CarExample carExample = new CarExample();
        CarExample.Criteria criteria2 = carExample.createCriteria();
        criteria2.andUser_idEqualTo(userList.get(0).getUser_id());
        List<Car> carList1 = carMapper.selectByExample(carExample);
        List<Car> carList2 = new ArrayList<>();
        for (Car car : carList1) {
            Goods goods = goodsMapper.selectByPrimaryKey(car.getGoods_id());
            car.setGoods(goods);
            carList2.add(car);
        }
        return carList2;
    }

    @Override
    public void add(int car_id) {
        Car car = carMapper.selectByPrimaryKey(car_id);
        int amount = car.getAmount() + 1;
        car.setAmount(amount);
        carMapper.updateByPrimaryKey(car);
    }

    @Override
    public void cut(int car_id) {
        Car car = carMapper.selectByPrimaryKey(car_id);
        int amount = car.getAmount() - 1;
        car.setAmount(amount);
        carMapper.updateByPrimaryKey(car);
    }

    @Override
    public void deleteOne(int car_id) {
        carMapper.deleteByPrimaryKey(car_id);
    }

    @Override
    public void delete(int[] car_ids) {
        for (int i = 0; i < car_ids.length; i++) {
            carMapper.deleteByPrimaryKey(car_ids[i]);
        }
    }

    @Override
    public void updateIsClick(int car_id) {
        Car car = carMapper.selectByPrimaryKey(car_id);
        int is_click = car.getIs_click() * -1;
        car.setIs_click(is_click);
        carMapper.updateByPrimaryKey(car);
    }
}

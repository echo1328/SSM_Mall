package com.ssm.mall.service;

import com.ssm.mall.pojo.Car;

import java.util.List;

public interface CarService {

    public void addGoodsToCarList(int goods_id, int amount, String user_name);

    public List<Car> findCarList(String user_name);

    public void add(int car_id);

    public void cut(int car_id);

    public void deleteOne(int car_id);

    public void delete(int[] car_ids);

    public void updateIsClick(int car_id);

}

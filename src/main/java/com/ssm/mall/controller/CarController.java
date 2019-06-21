package com.ssm.mall.controller;

import com.ssm.mall.pojo.Car;
import com.ssm.mall.service.CarService;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/2 23:21
 */

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/addGoodsToCarList")
    public Result addGoodsToCarList(int goods_id, int amount, String user_name) {
        try {
            carService.addGoodsToCarList(goods_id, amount, user_name);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    @RequestMapping("/findCarList")
    public List<Car> findCarList(String user_name) {
        return carService.findCarList(user_name);
    }

    @RequestMapping("/add")
    public void add(int car_id) {
        carService.add(car_id);
    }

    @RequestMapping("/cut")
    public void cut(int car_id) {
        carService.cut(car_id);
    }

    @RequestMapping("/deleteOne")
    public void deleteOne(int car_id) {
        carService.deleteOne(car_id);
    }

    @RequestMapping("/delete")
    public void delete(int[] car_ids) {
        carService.delete(car_ids);
    }

    @RequestMapping("/updateIsClick")
    public void updateIsClick(int car_id) {
        carService.updateIsClick(car_id);
    }

}

package com.ssm.mall.controller;

import com.ssm.mall.pojo.Seller;
import com.ssm.mall.pojo.Shop;
import com.ssm.mall.service.ShopService;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/13 15:12
 */

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping("/findAll")
    public List<Shop> findAll() {
        return shopService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page, int size) {
        return shopService.findPage(page, size);
    }

    @RequestMapping("/findOne")
    public Shop findOne(int id) {
        return shopService.findOne(id);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody Shop shop) {
        try {
            shopService.add(shop);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/update")
    public Result update(@RequestBody Shop shop) {
        try {
            shopService.update(shop);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("/deleteOne")
    public Result deleteOne(int id) {
        try {
            shopService.delete(id);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(int[] ids) {
        try {
            shopService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

}

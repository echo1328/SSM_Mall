package com.ssm.mall.controller;

import com.ssm.mall.pojo.Goods;
import com.ssm.mall.service.GoodsService;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/findAll")
    public List<Goods> findAll() {
        return goodsService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page, int size) {
        System.out.println("goods: page="+page+",size="+size);
        return goodsService.findPage(page,size);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody Goods goods) {
        try {
            System.out.print(goods.getName());
            goodsService.add(goods);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/findOne")
    public Goods findOne(int id) {
        return goodsService.findOne(id);
    }

    @RequestMapping("/find")
    public List<Goods> find(String key) {
        return goodsService.find(key);
    }

    @RequestMapping("/update")
    public void update(@RequestBody Goods goods) {
        goodsService.update(goods);
    }

    @RequestMapping("/deleteOne")
    public void deleteOne(int id) {
        goodsService.delete(id);
    }

    @RequestMapping("/delete")
    public void delete(int[] ids) {
        goodsService.delete(ids);
    }

}

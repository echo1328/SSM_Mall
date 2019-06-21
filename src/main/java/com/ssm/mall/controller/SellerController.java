package com.ssm.mall.controller;

import com.ssm.mall.pojo.Seller;
import com.ssm.mall.service.SellerService;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/13 19:59
 */

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping("/findAll")
    public List<Seller> findAll() {
        return sellerService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page, int size) {
        return sellerService.findPage(page,size);
    }

    @RequestMapping("/findOne")
    public Seller findOne(int id) {
        return sellerService.findOne(id);
    }

    @RequestMapping("/deleteOne")
    public Result deleteOne(int id) {
        try {
            sellerService.delete(id);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(int[] ids) {
        try {
            sellerService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/update")
    public Result updatee(@RequestBody Seller seller) {
        try {
            sellerService.update(seller);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

}

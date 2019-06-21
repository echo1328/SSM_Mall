package com.ssm.mall.controller;

import com.ssm.mall.pojo.Seckill;
import com.ssm.mall.service.SeckillService;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/16 9:26
 */

@RestController
@RequestMapping("/seckill")
public class SeckillController {

    @Autowired
    private SeckillService seckillService;

    @RequestMapping("/findList")
    public List<Seckill> findList() {
        return seckillService.findList();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page, int size) {
        return seckillService.findPage(page,size);
    }

    @RequestMapping("/findOneFromRedis")
    public Seckill findOneFromRedis(int id) {
        return seckillService.findOneFromRedis(id);
    }

    @RequestMapping("/submitOrder")
    public Result submitOrder(int id, String user_name) {
        try {
            seckillService.submitOrder(id, user_name);
            return new Result(true, "提交成功");
        } catch (RuntimeException e) {
            e.printStackTrace();
            return new Result(false, e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "提交失败");
        }
    }

}

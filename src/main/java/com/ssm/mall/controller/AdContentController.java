package com.ssm.mall.controller;

import com.ssm.mall.pojo.AdContent;
import com.ssm.mall.pojo.AdType;
import com.ssm.mall.service.AdContentService;
import com.ssm.mall.service.AdTypeService;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/5/31 9:27
 */

@RestController
@RequestMapping("/ad_content")
public class AdContentController {

    @Autowired
    private AdContentService adContentService;

    @RequestMapping("/findAll")
    public List<AdContent> findAll() {
        return adContentService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page, int size) {
        return adContentService.findPage(page,size);
    }

    @RequestMapping("/findOne")
    public AdContent findOne(int id) {
        return adContentService.findOne(id);
    }

    @RequestMapping("/deleteOne")
    public Result delete(int id) {
        try {
            adContentService.delete(id);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(int[] ids) {
        try {
            adContentService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/add")
    public Result delete(@RequestBody AdContent adContent) {
        System.out.println(adContent);
        try {
            adContentService.add(adContent);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/update")
    public Result update(@RequestBody AdContent adContent) {
        try {
            adContentService.update(adContent);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("/findByAdType")
    public List<AdContent> findByAdType(int type_id) {
        return adContentService.findByAdType(type_id);
    }

}

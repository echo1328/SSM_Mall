package com.ssm.mall.controller;

import com.ssm.mall.pojo.AdType;
import com.ssm.mall.service.AdTypeService;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/5/31 9:27
 */

@RestController
@RequestMapping("/ad_type")
public class AdTypeController {

    @Autowired
    private AdTypeService adTypeService;

    @RequestMapping("/findAll")
    public List<AdType> findAll() {
        return adTypeService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page, int size) {
        return adTypeService.findPage(page,size);
    }

    @RequestMapping("/findOne")
    public AdType findOne(int id) {
        return adTypeService.findOne(id);
    }

    @RequestMapping("/deleteOne")
    public Result delete(int id) {
        try {
            adTypeService.delete(id);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(int[] ids) {
        try {
            adTypeService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/add")
    public Result delete(@RequestBody AdType adType) {
        try {
            adTypeService.add(adType);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/update")
    public Result update(@RequestBody AdType adType) {
        try {
            adTypeService.update(adType);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

}

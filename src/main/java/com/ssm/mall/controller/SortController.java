package com.ssm.mall.controller;

import com.ssm.mall.pojo.Sort;
import com.ssm.mall.service.SortService;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sort")
public class SortController {

    @Autowired
    private SortService sortService;

    @RequestMapping("/findByParentId")
    public List<Sort> findByParentId(int parent_id) {
        return sortService.findByParentId(parent_id);
    }

    @RequestMapping("/findAll")
    public List<Sort> findAll() {
        return sortService.findAll();
    }

    @RequestMapping("/add")
    public Result add(@RequestBody Sort sort) {
        System.out.println("sort:"+sort.getParent_id()+"-"+sort.getName());
        try {
            sortService.add(sort);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/findOne")
    public Sort findOne(int id) {
        return sortService.findOne(id);
    }

    @RequestMapping("/update")
    public Result update(@RequestBody Sort sort) {
        System.out.println("sort:"+sort.getParent_id()+"-"+sort.getName());
        try {
            sortService.update(sort);
            return new Result(true,"更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"更新失败");
        }
    }

    @RequestMapping("/deleteOne")
    public Result update(int id) {
        try {
            sortService.delete(id);
            System.out.println("删除了分类id："+id);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

}

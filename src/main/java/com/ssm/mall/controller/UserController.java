package com.ssm.mall.controller;

import com.ssm.mall.pojo.User;
import com.ssm.mall.service.UserService;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page, int size) {
        System.out.println("user: page="+page+",size="+size);
        return userService.findPage(page,size);
    }

    @RequestMapping("/findOne")
    public User findOne(int id) {
        return userService.findOne(id);
    }

    @RequestMapping("/update")
    public Result update(@RequestBody User user) {
        try {
            userService.update(user);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("/deleteOne")
    public Result delete(int id) {
        try {
            userService.delete(id);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(int[] ids) {
        try {
            userService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/add")
    public Result add(@RequestBody User user) {
        try {
            userService.add(user);
            System.out.println(user);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/login")
    public Result login(String user_name, String user_pass) {
        System.out.println("用户名：" + user_name + "，密码：" + user_pass);
        boolean is = userService.login(user_name, user_pass);
        if (is) {
            return new Result(true,user_name);
        } else {
            return new Result(false,"登录失败");
        }
    }

}

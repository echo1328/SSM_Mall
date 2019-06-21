package com.ssm.mall.service;

import com.ssm.mall.pojo.User;
import entity.PageResult;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public User findOne(int id);

    public void update(User user);

    public void delete(int id);

    public void delete(int[] ids);

    public void add(User user);

    public boolean login(String user_name, String user_pass);

}

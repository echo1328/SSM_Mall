package com.ssm.mall.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ssm.mall.mapper.UserMapper;
import com.ssm.mall.pojo.User;
import com.ssm.mall.pojo.UserExample;
import com.ssm.mall.service.UserService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<User> page = (Page<User>) userMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public User findOne(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void delete(int id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delete(int[] ids) {
        for(int id : ids) {
            userMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void add(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public boolean login(String user_name, String user_pass) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUser_nameEqualTo(user_name);
        criteria.andUser_passEqualTo(user_pass);
        List<User> list = userMapper.selectByExample(example);
        if (list.size() == 1) {
            return true;
        } else {
            return false;
        }
    }

}

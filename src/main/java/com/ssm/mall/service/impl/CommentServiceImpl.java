package com.ssm.mall.service.impl;

import com.ssm.mall.mapper.CommentMapper;
import com.ssm.mall.mapper.UserMapper;
import com.ssm.mall.pojo.Comment;
import com.ssm.mall.pojo.CommentExample;
import com.ssm.mall.pojo.User;
import com.ssm.mall.pojo.UserExample;
import com.ssm.mall.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/11 23:05
 */

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Comment> findAll() {
        return commentMapper.selectByExample(null);
    }

    @Override
    public List<Comment> findAllById(int id) {
        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andGoods_idEqualTo(id);
        List<Comment> list = commentMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<Comment> findByGoodsId(int id) {
        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andGoods_idEqualTo(id);
        List<Comment> list = commentMapper.selectByExample(example);
        return list;
    }

    @Override
    public void write(String user_name, int shop_id, int goods_id, String content) {
        System.out.println(user_name);
        UserExample userExample = new UserExample();
        UserExample.Criteria userCriteria = userExample.createCriteria();
        userCriteria.andUser_nameEqualTo(user_name);
        List<User> userList = userMapper.selectByExample(userExample);
        Comment comment = new Comment();
        comment.setUser_id(userList.get(0).getUser_id());
        comment.setUser_name(user_name);
        comment.setShop_id(shop_id);
        comment.setGoods_id(goods_id);
        comment.setContent(content);
        comment.setTime(new Date());
        commentMapper.insertSelective(comment);
    }

}

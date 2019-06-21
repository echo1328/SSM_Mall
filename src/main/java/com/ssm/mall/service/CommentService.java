package com.ssm.mall.service;

import com.ssm.mall.pojo.Comment;

import java.util.Date;
import java.util.List;

public interface CommentService {

    public List<Comment> findAll();

    public List<Comment> findAllById(int id);

    public List<Comment> findByGoodsId(int id);

    public void write(String user_name, int shop_id, int goods_id, String content);

}

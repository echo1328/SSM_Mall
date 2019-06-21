package com.ssm.mall.controller;

import com.ssm.mall.pojo.Comment;
import com.ssm.mall.service.CommentService;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @auther wenlongzhou
 * @date 2019/6/11 23:06
 */

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("/findAll")
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @RequestMapping("/findAllById")
    public List<Comment> findAllById(int id) {
        return commentService.findAllById(id);
    }

    @RequestMapping("/findByGoodsId")
    public List<Comment> findByGoodsId(int id) {
        return commentService.findAllById(id);
    }

    @RequestMapping("/write")
    public Result write(String user_name, int shop_id, int goods_id, String content) {
        try {
            commentService.write(user_name, shop_id, goods_id, content);
            return new Result(true, "评价成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "评价失败");
        }
    }

}

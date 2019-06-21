package com.ssm.mall.controller;

import com.ssm.mall.service.GoodsSearchService;
import com.ssm.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @auther wenlongzhou
 * @date 2019/6/10 18:22
 */

@RestController
@RequestMapping("/goodssearch")
public class GoodsSearchController {

    @Autowired
    private GoodsSearchService goodsSearchService;

    @RequestMapping("/search")
    public Map search(@RequestBody Map searchMap) {
        return goodsSearchService.search(searchMap);
    }

}

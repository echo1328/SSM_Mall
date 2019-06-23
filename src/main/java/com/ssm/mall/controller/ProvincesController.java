package com.ssm.mall.controller;

import com.ssm.mall.pojo.Provinces;
import com.ssm.mall.service.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: SSM_Mall
 * @description: ProvincesController
 * @author: wenlongzhou
 * @create: 2019-06-23 11:21
 **/

@RestController
@RequestMapping("/provinces")
public class ProvincesController {

    @Autowired
    private ProvincesService provincesService;

    @RequestMapping("/findAll")
    public List<Provinces> findAll() {
        return provincesService.finAll();
    }

}

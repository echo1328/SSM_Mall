package com.ssm.mall.controller;

import com.ssm.mall.pojo.Areas;
import com.ssm.mall.pojo.Provinces;
import com.ssm.mall.service.AreasService;
import com.ssm.mall.service.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: SSM_Mall
 * @description: AreasController
 * @author: wenlongzhou
 * @create: 2019-06-23 11:21
 **/

@RestController
@RequestMapping("/areas")
public class AreasController {

    @Autowired
    private AreasService areasService;

    @RequestMapping("/findAll")
    public List<Areas> findAll() {
        return areasService.finAll();
    }

    @RequestMapping("/findAllByCitiesId")
    public List<Areas> findAllByCitiesId(String id) {
        return areasService.findAllByCitiesId(id);
    }

}

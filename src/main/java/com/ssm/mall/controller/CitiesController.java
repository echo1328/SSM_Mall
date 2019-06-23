package com.ssm.mall.controller;

import com.ssm.mall.pojo.Cities;
import com.ssm.mall.pojo.Provinces;
import com.ssm.mall.service.CitiesService;
import com.ssm.mall.service.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: SSM_Mall
 * @description: CitiesController
 * @author: wenlongzhou
 * @create: 2019-06-23 11:21
 **/

@RestController
@RequestMapping("/cities")
public class CitiesController {

    @Autowired
    private CitiesService citiesService;

    @RequestMapping("/findAll")
    public List<Cities> findAll() {
        return citiesService.findAll();
    }

    @RequestMapping("/findAllByProvincesId")
    public List<Cities> findAllByProvincesId(String id) {
        return citiesService.findAllByProvincesId(id);
    }

}

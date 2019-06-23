package com.ssm.mall.controller;

import com.ssm.mall.pojo.Address;
import com.ssm.mall.service.AddressService;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SSM_Mall
 * @description: AddressController
 * @author: wenlongzhou
 * @create: 2019-06-23 15:07
 **/

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/add")
    public Result add(@RequestBody Address address) {
        try {
            addressService.add(address);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

}

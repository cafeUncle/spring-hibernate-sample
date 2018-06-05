package com.zq.controller;

import com.zq.entity.Image;
import com.zq.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    BaseService baseService;

    @GetMapping(value = "/")
    public Image test() {
        return baseService.test();
    }
}

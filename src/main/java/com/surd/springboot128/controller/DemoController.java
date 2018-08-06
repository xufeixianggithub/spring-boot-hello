package com.surd.springboot128.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.surd.springboot128.service.RedisService;

@RestController
public class DemoController {


    @Autowired
    private RedisService redisService ;


    @RequestMapping(value = "/test")
    public String demoTest(){
        redisService.set("1","value22222");
        System.out.println(redisService.get("1"));
        return "index";
    }

}
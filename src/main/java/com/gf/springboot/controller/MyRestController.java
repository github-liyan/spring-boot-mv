package com.gf.springboot.controller;

import com.gf.springboot.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

/**
 * @Des:
 * @Author: Liyan
 * @Date: 2019:05:28 21:15
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "users")
public class MyRestController {


    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User getUser(String id){
        User user = new User();
        user.setName("spring-boot");
        user.setAge(22);
        return user;
    }
}

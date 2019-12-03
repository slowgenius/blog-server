package com.slowgenius.myblog.controller;

import com.slowgenius.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author slowgenius
 * @date 2019/11/28 18:38
 * @description
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String helloWorld(Integer id) {
        return userService.queryObject(id).getUserName();
    }
}

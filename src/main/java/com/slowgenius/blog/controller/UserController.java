package com.slowgenius.blog.controller;

import com.slowgenius.blog.entity.UserEntity;
import com.slowgenius.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author slowgenius
 * @date 2019/11/28 18:38
 * @description
 */
@RestController
@RequestMapping("login")
public class UserController {
    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping("login")
    public String login(String userName, String password) {
        UserEntity user = userService.queryByNameAndPassword(userName, password);
        if (user != null && password.equals(user.getPassword())) {
            return "1";
        }
        return "0";
    }
}

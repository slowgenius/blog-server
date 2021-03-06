package com.slowgenius.blog.service.impl;

import com.slowgenius.blog.entity.UserEntity;
import com.slowgenius.blog.mapper.UserMapper;
import com.slowgenius.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author slowgenius
 * @date 2019/12/2 19:22
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity queryObject(Integer id) {
        return userMapper.queryObject(id);
    }

    @Override
    public UserEntity queryByNameAndPassword(String userName, String password) {
        return userMapper.queryByNameAndPassword(userName, password);
    }
}

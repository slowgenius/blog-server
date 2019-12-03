package com.slowgenius.myblog.service.impl;

import com.slowgenius.myblog.entity.UserEntity;
import com.slowgenius.myblog.mapper.UserMapper;
import com.slowgenius.myblog.service.UserService;
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

}

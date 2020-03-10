package com.slowgenius.blog.service;

import com.slowgenius.blog.entity.UserEntity;

/**
 * @author slowgenius
 * @date 2019/12/2 19:21
 * @description
 */
public interface UserService {

    UserEntity queryObject(Integer id);

    UserEntity queryByNameAndPassword(String userName, String password);
}

package com.slowgenius.myblog.service;

import com.slowgenius.myblog.entity.UserEntity;

/**
 * @author slowgenius
 * @date 2019/12/2 19:21
 * @description
 */
public interface UserService {

    UserEntity queryObject(Integer id);

}

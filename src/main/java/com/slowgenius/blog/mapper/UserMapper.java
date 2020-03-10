package com.slowgenius.blog.mapper;

import com.slowgenius.blog.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author slowgenius
 * @date 2019/12/2 18:32
 * @description
 */

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

    UserEntity queryByNameAndPassword(String userName, String password);
}

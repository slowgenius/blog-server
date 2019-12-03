package com.slowgenius.myblog.mapper;

import com.slowgenius.myblog.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author slowgenius
 * @date 2019/12/2 18:32
 * @description
 */

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}

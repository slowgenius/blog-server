package com.slowgenius.myblog.mapper;

/**
 * @author slowgenius
 * @date 2019/12/2 18:32
 * @description
 */
public interface BaseMapper<T> {

    T queryObject(Integer id);
}

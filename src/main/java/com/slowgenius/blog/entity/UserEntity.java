package com.slowgenius.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author slowgenius
 * @date 2019/12/2 18:33
 * @description
 */
@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //主键
    private Integer id;
    //用户名称
    private String userName;
    //密码
    private String password;

}

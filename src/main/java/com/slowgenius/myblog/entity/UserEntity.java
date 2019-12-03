package com.slowgenius.myblog.entity;

import java.io.Serializable;

/**
 * @author slowgenius
 * @date 2019/12/2 18:33
 * @description
 */
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //主键
    private Integer id;
    //用户名称
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

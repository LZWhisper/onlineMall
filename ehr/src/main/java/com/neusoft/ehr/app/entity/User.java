package com.neusoft.ehr.app.entity;

import com.neusoft.ehr.sys.entity.BaseEntity;

public class User extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private String name;
    private  String username;
    private  String password;
    private  String phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}

package com.qf.car.service;

import com.qf.car.domain.entity.User;
import com.google.protobuf.Service;


public interface UserService {
    /**
     * 登录
     */
    User login(String name);

    /**
     * 注册
     */
    User registered(String name,String password,int status);

}

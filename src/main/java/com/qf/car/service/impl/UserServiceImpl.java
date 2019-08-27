package com.qf.car.service.impl;

import com.qf.car.domain.entity.User;
import com.qf.car.mapper.UserMapper;
import com.qf.car.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User login(String name) {
        return userMapper.login(name);
    }

    @Override
    public User registered(String name, String password, int status) {
        return userMapper.registered(name,password,status);
    }
}

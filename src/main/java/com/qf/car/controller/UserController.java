package com.qf.car.controller;

import com.qf.car.domain.entity.User;
import com.qf.car.service.UserService;
import com.qf.car.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static com.qf.car.utils.Constant.SUCCESS_STATUS;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @GetMapping(value = "/login",params = {"name","password"})
    public Result login(String name,String password){
        User login = userService.login(name);
        Result result = null;
        try {
            if (name==null || "".equals(name) || password==null || "".equals(password)) {
                return Result.error();
            }else if(name.equals(login.getName()) && password.equals(login.getPassword())){
                return Result.login();
            }else {
                return Result.error();
            }
        } catch (Exception e) {
             return Result.error();
        }
    }

    @GetMapping(value = "regist",params = {"name,password"})
    public Result register(String name ,String password){
        try {
            return Result.success(userService.registered(name,password,0));
        } catch (Exception e) {
            return Result.error();
        }
    }
}

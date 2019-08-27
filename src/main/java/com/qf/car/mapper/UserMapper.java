package com.qf.car.mapper;

import com.qf.car.domain.entity.User;
import org.apache.ibatis.annotations.Param;



public interface UserMapper {
    /**
     * 登录
     * @param name
     * @return
     */
    User login(@Param("name") String name);

    /**
     * 注册
     * @param name
     * @param password
     * @return
     */
    User registered(@Param("name") String name,@Param("password") String password,@Param("status") int status);

}

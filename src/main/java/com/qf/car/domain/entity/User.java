package com.qf.car.domain.entity;

import lombok.Data;

@Data
public class User {
    private int uid;
    private String name;
    private String password;
    private int status;
}

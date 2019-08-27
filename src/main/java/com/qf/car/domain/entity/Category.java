package com.qf.car.domain.entity;

import lombok.Data;

@Data
public class Category {
    /**
    * 导航条id
    */
    private Integer cateId;

    /**
    * 导航条名称
    */
    private String name;
}
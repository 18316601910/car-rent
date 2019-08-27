package com.qf.car.domain.entity;

import lombok.Data;

@Data
public class CarMenu {
    /**
    * 汽车品牌id
    */
    private Integer carMenuId;

    /**
    * 汽车品牌
    */
    private String carMenuName;

    private Integer cateId;
}
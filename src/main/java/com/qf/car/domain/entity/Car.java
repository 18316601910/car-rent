package com.qf.car.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Car {
    private Integer carId;

    /**
    * 车名
    */
    private String carName;

    private String carTitle;

//    private Integer carNumber;

    private String carImage;

    /**
    * 租一天的单价
    */
    private BigDecimal carPrice;

    /**
    * 0表示还未租，1表示已租
    */
    private Integer carStatus;

    /**
    * 车牌号
    */
    private String carPlate;

    /**
    * 车的简介
    */
    private int carMenu1Id;
    private String createDate;

}
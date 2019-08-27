package com.qf.car.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class CarCart {
    private Integer carCartId;

    private Integer uid;

    private Integer carId;

    /**
    * 开始租车的时间
    */
    private Date carCartCreateDate;

    /**
    * 归还的时间
    */
    private Date carCartReturnDate;
}
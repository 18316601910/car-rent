package com.qf.car.service;

import com.qf.car.domain.entity.CarCart;

import java.util.Date;
import java.util.List;

public interface CarCartService {
    List<CarCart> findById(int uid);
//    int updateNumById(int cartId,int op);
//    CarCart findCartByUidCartId(int uid ,int cartId);
    int delCart(int cartId);
    CarCart addCart(int uid, int card, Date creatDate,Date returnDate);
}

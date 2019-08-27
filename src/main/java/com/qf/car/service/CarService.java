package com.qf.car.service;

import com.qf.car.domain.entity.Car;

import java.util.List;

public interface CarService {
    /**
     * 所有汽车
     */
    List<Car> findAll();
    List<Car> search(String kw,int page,int size);
}

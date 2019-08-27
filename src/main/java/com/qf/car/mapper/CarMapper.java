package com.qf.car.mapper;

import com.qf.car.domain.entity.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper {
    List<Car> findAll();
    List<Car> search(@Param("kw") String kw,@Param("page") int page,@Param("size") int size);
}
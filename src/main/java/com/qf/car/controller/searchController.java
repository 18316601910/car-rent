package com.qf.car.controller;

import com.qf.car.service.CarService;
import com.qf.car.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/search")
@Slf4j
public class searchController {

    @Resource
    CarService carService;

    @GetMapping("/car/{page}/{size}")
    public Result search(String kw,@PathVariable("page")int page,@PathVariable("size")int size){
        try {
            return Result.success(carService.search(kw,page,size));
        } catch (Exception e) {
            return Result.error();
        }
    }
}

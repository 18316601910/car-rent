package com.qf.car.controller;

import com.qf.car.service.CateService;
import com.qf.car.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/index")
public class IndexController {
    @Resource
    CateService cateService;

    @GetMapping("/heads")
    public Result getHeader(){
        try {
            return Result.success(cateService.getHeader());
        } catch (Exception e) {
            return Result.error();
        }
    }
}

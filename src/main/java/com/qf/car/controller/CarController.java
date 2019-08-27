package com.qf.car.controller;


import com.qf.car.domain.entity.Car;
import com.qf.car.service.CarCartService;
import com.qf.car.service.CarService;
import com.qf.car.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/car")
@Slf4j
public class CarController {
    @Resource
    CarService carService ;
    @Resource
    CarCartService carCartService;

    @GetMapping("/findAll")
    public Result findCar(){
        try {
            List<Car> all = carService.findAll();
            return Result.success(all);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 点击购物车
     * @param uid
     * @return
     */
    @GetMapping("/findcarcart")
    public Result findcarcart(int uid){
        try {
            return Result.success(carCartService.findById(uid));
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 添加购物车
     * @param uid
     * @param carId
     * @return
     */
    @GetMapping("/addCart")
    public Result addCart(int uid, int carId, Date createDate,Date returnDate){
        try {
            return Result.success(carCartService.addCart(uid,carId,createDate,returnDate));
        } catch (Exception e) {
            return Result.error();
        }
    }

    @GetMapping("/delCart")
    public Result delCart(int cartId){
        try {
            return Result.success(carCartService.delCart(cartId));
        } catch (Exception e) {
            return Result.error();
        }
    }
    /**
     * 更新数量
     */
//    public Result updateNum(int cartId,int op){
//        try {
//            return Result.success(carCartService.updateNumById(cartId,op));
//        } catch (Exception e) {
//            return Result.error();
//        }
//    }
    /**
     * 是否存在订单
     */
//    public Result findCartByUidCartId(int uid ,int cartId){
//        try {
//            return Result.success(carCartService.findCartByUidCartId(uid,cartId));
//        } catch (Exception e) {
//            return Result.error();
//        }
//    }
    /**
     * 删除购物车
     */

    /**
     *
     */
}

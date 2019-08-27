package com.qf.car.utils;

import lombok.Data;

import static com.qf.car.utils.Constant.*;


@Data
public class Result<T> {
    private int status;
    private String msg;
    private T data;

    public static Result success(Object obj){
        Result result = new Result();
        result.setData(obj);
        result.setMsg(SUCCESS_MSG);
        result.setStatus(SUCCESS_STATUS);
        return result;
    }

    public static  Result error(){
        Result result = new Result();
        result.setMsg(ERROR_MSG);
        result.setStatus(ERROR_STATUS);
        return result;
    }
    public static Result login(){
        Result result = new Result();
         result.setStatus(SUCCESS_STATUS);
         return result;
    }
}

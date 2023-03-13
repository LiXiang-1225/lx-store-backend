package com.lixiang.lxstorebackend.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

//    通用异常处理方法
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.error();
    }

//    指定异常处理方法
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public Result error(NullPointerException e) {
        e.printStackTrace();
        return Result.setResult(ResultCodeEnum.NULL_POINT);
    }

//    自定义异常处理方法
    @ExceptionHandler(EMSException.class)
    @ResponseBody
    public Result error(EMSException e) {
        e.printStackTrace();
        return Result.error().message(e.getMessage()).code(e.getCode());
    }
}

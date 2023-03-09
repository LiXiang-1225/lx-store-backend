package com.lixiang.lxstorebackend.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Result {
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    private Result() {
    }

    public static Result ok() {
        Result result = new Result();
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setCode(ResultCodeEnum.ERROR.getCode());
        result.setMessage(ResultCodeEnum.ERROR.getMessage());
        return result;
    }

    public static Result setResult(ResultCodeEnum r) {
        Result result = new Result();
        result.setCode(r.getCode());
        result.setMessage(r.getMessage());
        return result;
    }
//    自定义返回数据

    public Result data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
//    通用设置data

    public Result data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    //    自定义状态信息
    public Result message(String message) {
        this.setMessage(message);
        return this;
    }

    //    自定义状态码
    public Result code(Integer code) {
        this.setCode(code);
        return this;
    }

}



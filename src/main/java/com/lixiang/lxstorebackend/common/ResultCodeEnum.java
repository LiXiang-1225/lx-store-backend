package com.lixiang.lxstorebackend.common;

import lombok.Getter;

@Getter
//@ToString
public enum ResultCodeEnum {
    SUCCESS(200, "success"),
    ERROR(500, "internal server error"),
    NULL_POINT(600,"null pointer exception"),
    ;

    private final Integer code;
    private final String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}



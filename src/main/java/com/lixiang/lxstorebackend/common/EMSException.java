package com.lixiang.lxstorebackend.common;

import lombok.Data;

@Data
public class EMSException extends RuntimeException {
    private Integer code;

    public EMSException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public EMSException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "CMSException{" + "code" + code + ", message=" + this.getMessage() + "}";
    }
}

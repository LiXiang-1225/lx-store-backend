package com.lixiang.lxstorebackend.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;
}

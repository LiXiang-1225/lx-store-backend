DROP TABLE user;
CREATE TABLE user (
    uid INT AUTO_INCREMENT COMMENT '用户id',
    username VARCHAR(20) NOT NULL UNIQUE COMMENT '用户名',
    password CHAR(32) NOT NULL COMMENT '密码',
    phone VARCHAR(20) COMMENT '电话号码',
    email VARCHAR(30) COMMENT '邮箱',
    gender INT COMMENT '性别：0女男1',
    avatar VARCHAR(50) COMMENT '头像',
    created_user VARCHAR(20) COMMENT '日志-创建人',
    created_time DATETIME COMMENT '日志-创建时间',
    modified_user VARCHAR(20) COMMENT '日志-最后修改人',
    modified_time DATETIME COMMENT '日志-最后修改时间',
    PRIMARY KEY (uid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
package com.lixiang.lxstorebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LxStoreBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxStoreBackendApplication.class, args);
    }

}

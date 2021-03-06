package com.xiaoli.providerfour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xiaoli.providerfour.dao")
public class ProviderfourApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderfourApplication.class, args);
    }

}

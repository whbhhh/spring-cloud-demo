package com.whb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启服务端
@EnableEurekaServer
public class Eureka3001Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka3001Application.class);
    }
}

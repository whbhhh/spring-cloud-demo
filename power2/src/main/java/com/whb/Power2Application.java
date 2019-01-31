package com.whb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Power2Application {
    public static void main(String[] args) {
        SpringApplication.run(Power2Application.class);
    }
}

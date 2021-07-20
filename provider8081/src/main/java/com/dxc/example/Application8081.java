package com.dxc.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Application8081 {
    public static void main(String[] args) {
        SpringApplication.run(Application8081.class,args);
    }
}

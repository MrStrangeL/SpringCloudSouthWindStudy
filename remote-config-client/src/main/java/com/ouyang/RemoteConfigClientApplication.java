package com.ouyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RemoteConfigClientApplication {
    public static void main(String[] args){
        SpringApplication.run(RemoteConfigClientApplication.class,args);
    }
}

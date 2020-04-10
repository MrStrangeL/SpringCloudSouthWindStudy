package com.ouyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class RemoteConfigServerApplication {
    public static void main(String[] args){
        SpringApplication.run(RemoteConfigServerApplication.class,args);
    }
}

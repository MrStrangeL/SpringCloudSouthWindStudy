package com.ouyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @SpringBootApplication : spring boot项目的启动类
 * @EnableFeignClients : 声明启用Feign
 * @EnableCircuitBreaker : 声明启用数据监控
 * @EnableHystrix : 启用熔断器
 * @EnableHystrixDashboard : 启用可视化界面监控数据  http://localhost:8070/hystrix
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrix
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args){
        SpringApplication.run(HystrixApplication.class,args);
    }
}

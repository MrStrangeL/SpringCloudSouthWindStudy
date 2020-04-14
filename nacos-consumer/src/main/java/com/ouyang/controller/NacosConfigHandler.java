package com.ouyang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos-consumer-config")
public class NacosConfigHandler {
    @Value("${server.port}")
    private String port;

    @Value("${config.info}")
    private String info;

    @GetMapping("/port")
    public String port(){
        return "server.port:"+this.port;
    }

    @GetMapping("/info")
    public String info(){
        return "config.info:"+this.info;
    }
}

package com.ouyang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/remote")
@RestController
public class RemoteConfigClientHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("")
    public String index(){
        return "获取远程配置文件server.port:"+this.port;
    }
}

package com.ouyang.feign;

import com.ouyang.entity.Student;
import com.ouyang.feign.imp.FeignProviderClientImp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @FeignClient 指定 Feign 要调用的微服务，直接指定服务提供者在注册中心的 application name 即可
 * feign.hystrix.enabled=true,开启熔断器之后，如果服务出现异常则会调用该实现类fallback = FeignProviderClientImp.class
 */
@FeignClient(value = "provider",fallback = FeignProviderClientImp.class)
public interface FeignProviderClient {
    @GetMapping("/student/index")
    String index();

    @GetMapping("/student/findStudentAll")
    Collection<Student> findStudentAll();

    @GetMapping("/student/findStudentById/{id}")
    Student findStudentById(@PathVariable("id")Integer id);

    @PostMapping("/student/save")
    void save(@RequestBody Student student);

    @PutMapping("/student/update")
    void update(@RequestBody Student student);

    @DeleteMapping("/student/deleteStudentById/{id}")
    void deleteStudentById(@PathVariable("id")Integer id);

}

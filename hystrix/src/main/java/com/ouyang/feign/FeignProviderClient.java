package com.ouyang.feign;

import com.ouyang.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@FeignClient(value = "provider")
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

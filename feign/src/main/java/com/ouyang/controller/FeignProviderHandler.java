package com.ouyang.controller;

import com.ouyang.entity.Student;
import com.ouyang.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/feign")
@RestController
public class FeignProviderHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }

    @GetMapping("/findStudentAll")
    public Collection<Student> findStudentAll() {
        return feignProviderClient.findStudentAll();
    }

    @GetMapping("/findStudentById/{id}")
    public Student findStudentById(@PathVariable("id") Integer id) {
        return feignProviderClient.findStudentById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        feignProviderClient.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        feignProviderClient.update(student);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@PathVariable("id") Integer id){
        feignProviderClient.deleteStudentById(id);
    }
}

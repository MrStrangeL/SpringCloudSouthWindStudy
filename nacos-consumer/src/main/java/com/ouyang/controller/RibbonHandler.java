package com.ouyang.controller;

import com.ouyang.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestOperations;

import java.util.Collection;

@RequestMapping("/nacos-consumer")
@RestController
public class RibbonHandler {
    @Autowired
    private RestOperations restTemplate;

//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://nacos-provider/student/index",String.class);
    }

    @GetMapping("/findStudentAll")
    public Collection<Student> findStudentAll(){
        return restTemplate.getForObject("http://nacos-provider/student/findStudentAll",Collection.class);
    }

    @GetMapping("/findStudentById/{id}")
    public Student findStudentById(@PathVariable("id")Integer id){
        return restTemplate.getForObject("http://nacos-provider/student/findStudentById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://nacos-provider/student/save",student,Student.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://nacos-provider/student/update",student);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@PathVariable("id")Integer id){
        restTemplate.delete("http://nacos-provider/student/deleteStudentById/{id}",id);
    }
}

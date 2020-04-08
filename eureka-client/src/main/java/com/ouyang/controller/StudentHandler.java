package com.ouyang.controller;

import com.ouyang.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RequestMapping("/consumer")
@RestController
public class StudentHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://127.0.0.1:8010/student/index",String.class);
    }

    @GetMapping("/findStudentAll")
    public Collection<Student> findStudentAll(){
        return restTemplate.getForObject("http://127.0.0.1:8010/student/findStudentAll",Collection.class);
    }

    @GetMapping("/findStudentById/{id}")
    public Student findStudentById(@PathVariable("id")Integer id){
        return restTemplate.getForObject("http://127.0.0.1:8010/student/findStudentById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://127.0.0.1:8010/student/save",student,Student.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://127.0.0.1:8010/student/update",student);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@PathVariable("id")Integer id){
        restTemplate.delete("http://127.0.0.1:8010/student/deleteStudentById/{id}",id);
    }
}

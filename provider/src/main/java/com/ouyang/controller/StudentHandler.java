package com.ouyang.controller;

import com.ouyang.entity.Student;
import com.ouyang.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/student")
@RestController
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port;
    }

    @GetMapping("/findStudentAll")
    public Collection<Student> findStudentAll(){
        return studentRepository.findStudentAll();
    }

    @GetMapping("/findStudentById/{id}")
    public Student findStudentById(@PathVariable("id")Integer id){
        return studentRepository.findStudentById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdateStudent(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdateStudent(student);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@PathVariable("id")Integer id){
        studentRepository.deleteStudentById(id);
    }
}

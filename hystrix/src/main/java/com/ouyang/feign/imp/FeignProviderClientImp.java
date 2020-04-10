package com.ouyang.feign.imp;

import com.ouyang.entity.Student;
import com.ouyang.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignProviderClientImp implements FeignProviderClient {
    @Override
    public String index() {
        return "服务器异常";
    }

    @Override
    public Collection<Student> findStudentAll() {
        return null;
    }

    @Override
    public Student findStudentById(Integer id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteStudentById(Integer id) {

    }
}

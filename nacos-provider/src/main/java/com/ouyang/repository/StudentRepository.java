package com.ouyang.repository;

import com.ouyang.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    Collection<Student> findStudentAll();
    Student findStudentById(Integer id);
    void saveOrUpdateStudent(Student student);
    void deleteStudentById(Integer id);
}

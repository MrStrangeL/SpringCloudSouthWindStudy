package com.ouyang.repository.imp;

import com.ouyang.entity.Student;
import com.ouyang.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImp implements StudentRepository {

    private Map<Integer,Student> studentMap;

    public StudentRepositoryImp(){
        studentMap=new HashMap<>();
        studentMap.put(1,new Student(1,"刘杨斌","男"));
        studentMap.put(2,new Student(2,"王清明","男"));
        studentMap.put(3,new Student(3,"宋灼吕","男"));
    }

    @Override
    public Collection<Student> findStudentAll() {
        return studentMap.values();
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdateStudent(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentMap.remove(id);
    }
}

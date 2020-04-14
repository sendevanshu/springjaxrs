package com.myapps.springjaxrs.services;

import com.myapps.springjaxrs.models.Student;
import com.myapps.springjaxrs.repositories.StudentRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        studentRepository.findAll()
                .iterator()
                .forEachRemaining(studentList::add);
        return studentList;
    }
}

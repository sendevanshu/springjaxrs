package com.myapps.springjaxrs.endpoints;

import com.myapps.springjaxrs.external.IUserService;
import com.myapps.springjaxrs.models.Student;
import com.myapps.springjaxrs.models.UserResponse;
import com.myapps.springjaxrs.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EntityEndpoint implements IEntityEndpoint {

    @Autowired
    StudentService studentService;

    @Autowired
    IUserService userService;

    @Override
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @Override
    public UserResponse getAllUsers() {
        return userService.getUsers(2);
    }
}

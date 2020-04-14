package com.myapps.springjaxrs.endpoints;

import com.myapps.springjaxrs.models.Student;
import com.myapps.springjaxrs.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("students")
public class StudentEndpoint implements IStudentEndpoint {

    @Autowired
    StudentService studentService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}

package com.myapps.springjaxrs.endpoints;

import com.myapps.springjaxrs.models.Student;
import lombok.val;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Controller
@Path("students")
public class StudentEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    public List<Student> getAllStudents() {
        val list = new ArrayList<Student>();
        val student1 = Student.builder()
                .name("Abc")
                .standard("First")
                .build();
        val student2 = Student.builder()
                .name("Def")
                .standard("First")
                .build();
        list.add(student1);
        list.add(student2);
        return list;
    }
}

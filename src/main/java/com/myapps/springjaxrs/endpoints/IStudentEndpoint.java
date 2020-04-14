package com.myapps.springjaxrs.endpoints;

import com.myapps.springjaxrs.models.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("students")
public interface IStudentEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    public List<Student> getAllStudents();
}

package com.myapps.springjaxrs.endpoints;

import com.myapps.springjaxrs.models.Student;
import com.myapps.springjaxrs.models.UserInfo;
import com.myapps.springjaxrs.models.UserResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("entity")
public interface IEntityEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/students")
    public List<Student> getAllStudents();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/users")
    public UserResponse getAllUsers();
}

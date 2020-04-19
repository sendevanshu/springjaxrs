package com.myapps.springjaxrs.external;

import com.myapps.springjaxrs.models.UserInfo;
import com.myapps.springjaxrs.models.UserResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public interface IUserService {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public UserResponse getUsers(@QueryParam("page") @DefaultValue("1") int page);
}

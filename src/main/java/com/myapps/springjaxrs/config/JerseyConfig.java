package com.myapps.springjaxrs.config;

import com.myapps.springjaxrs.endpoints.EntityEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(EntityEndpoint.class);
    }
}

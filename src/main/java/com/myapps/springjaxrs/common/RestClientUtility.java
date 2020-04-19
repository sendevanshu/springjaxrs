package com.myapps.springjaxrs.common;

import org.glassfish.jersey.client.proxy.WebResourceFactory;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;

public interface RestClientUtility {

    public default <T> T generateClient(Class<T> resource, String url) {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(UriBuilder.fromPath(url));
        return WebResourceFactory.newResource(resource, webTarget);
    }
}

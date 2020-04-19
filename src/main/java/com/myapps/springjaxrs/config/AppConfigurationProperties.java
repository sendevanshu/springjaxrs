package com.myapps.springjaxrs.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "springjaxrs")
@Getter
@Setter
public class AppConfigurationProperties {
    private String reqResUrl;
}

package com.myapps.springjaxrs.spring;

import com.myapps.springjaxrs.common.RestClientUtility;
import com.myapps.springjaxrs.config.AppConfigurationProperties;
import com.myapps.springjaxrs.external.IUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UsersBean implements RestClientUtility {


    @Bean
    public IUserService getUsers(AppConfigurationProperties appConfigurationProperties) {
        return generateClient(IUserService.class, appConfigurationProperties.getReqResUrl());
    }
}

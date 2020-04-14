package com.myapps.springjaxrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@ComponentScan(basePackages = "com.myapps.springjaxrs")
public class SpringjaxrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjaxrsApplication.class, args);
	}

}

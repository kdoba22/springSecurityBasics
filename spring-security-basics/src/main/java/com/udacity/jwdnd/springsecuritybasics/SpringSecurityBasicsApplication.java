package com.udacity.jwdnd.springsecuritybasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// @SpringBootApplication
@SpringBootApplication
public class SpringSecurityBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicsApplication.class, args);
	}

}

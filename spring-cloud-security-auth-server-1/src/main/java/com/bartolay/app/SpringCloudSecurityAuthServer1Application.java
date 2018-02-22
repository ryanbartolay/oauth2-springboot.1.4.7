package com.bartolay.app;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class SpringCloudSecurityAuthServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityAuthServer1Application.class, args);
	}
	
	@RequestMapping(value="/user")
	Principal getUser(Principal user) {
		return user;
	}
}

package com.bartolay.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class SpringCloudSecurityAuthServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityAuthServer1Application.class, args);
	}
}

package com.bartolay.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class SpringCloudSecurityResourceserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityResourceserverApplication.class, args);
	}
}

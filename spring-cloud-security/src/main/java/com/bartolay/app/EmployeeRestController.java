package com.bartolay.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class EmployeeRestController extends WebSecurityConfigurerAdapter {

	@Autowired
	private OAuth2ClientContext oAuth2ClientContext;
	
	private Object[][] data = new Object[][] {{1,"ryan", 32},{2, "Joenna", 32}};
	private List<Employee> employees = new ArrayList<>();
	
	public EmployeeRestController() {
		Arrays.asList(data).stream().forEach(e -> { 
			employees.add(new Employee(Integer.parseInt(e[0].toString()), e[1].toString(), Integer.parseInt(e[2].toString())));
		});
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public List<Employee> getEmployees() {		
		return employees;
	}
	
	@RequestMapping(value="/employee/{id}", method=RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable Long id) {
		return employees.stream().filter(e -> e.getEmployeeId() == id.longValue()).findFirst().get();
	}

	@RequestMapping(value="/access_token")
	public String getToken() {
		String token = oAuth2ClientContext.getAccessToken().getValue();
		System.err.println("Access Token " + token);
		return token;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/", "/employee")
		.permitAll()
		.anyRequest()
		.authenticated();
	}
}

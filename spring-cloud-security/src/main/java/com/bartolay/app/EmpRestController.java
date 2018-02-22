package com.bartolay.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpRestController {
	
//	private final Map<Integer,Employee> employees = new HashMap<>();
	
	public List<Employee> getEmployees() {
		
		Object[][] data = new Object[][] {{1,"ryan", 32},{2, "Joenna", 32}};
		
		List<Employee> employees = new ArrayList<>();
		Arrays.asList(data).stream().forEach(e -> { employees.add(new Employee(Integer.parseInt(e[0].toString()), e[1].toString(), Integer.parseInt(e[2].toString())));});
		
		return employees;
	}

}

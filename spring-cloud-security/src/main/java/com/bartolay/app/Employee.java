package com.bartolay.app;

public class Employee {
	private long employeeId;
	private String name;
	private int age;
	
	public Employee() {
		super();
	}

	public Employee(long employeeId, String name, int age) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age + "]";
	}
	
}

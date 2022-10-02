package com.gs.streams;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private int age;
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;				
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return name;
	}

}
class Department{
	private String name;
	private List<Employee>employees;
	public Department(String name) {
		this.name = name;
		employees = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	public List<Employee> getEmployees(){
		return employees;
	}
}

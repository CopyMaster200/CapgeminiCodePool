package com.gs.prog;

import java.util.ArrayList;
import java.util.List;

public class ImmutableDemoForEmployee {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("Banglore");
		lst.add("Hyderabad");
		Employee emp = new Employee(1, "Suresh", lst);
		System.out.println("Before modification:" + emp);
		emp.getAddressList().add("Manglore");
		System.out.println("After modification:" + emp);
	}

}

final class Employee {
	// final at class level is defining that child classes can't be created.

	private final Integer id;
	private final String name;
	private final List<String> addressList;

	public Employee(Integer id, String name, List<String> addressList) {
		this.id = id;
		this.name = name;
		this.addressList = addressList;
	}

	public Integer getId() {
		return new Integer(id);
	}

	public String getName() {
		return new String(name);
	}

	public List<String> getAddressList() {
		return new ArrayList<String>(addressList);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addressList=" + addressList + "]";
	}

}

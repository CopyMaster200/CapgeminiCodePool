package com.gs.patterns;

public class UserTelescoping {
	private String firstName, lastName;
	private int age;
	private String phone;

	public UserTelescoping() {
		super();
	}

	public UserTelescoping(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UserTelescoping(String firstName, String lastName, int age) {
		this(firstName, lastName);
		this.age = age;
	}

	public UserTelescoping(String firstName, String lastName, int age, String phone) {
		this(firstName, lastName, age);
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "UserTelescoping [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone="
				+ phone + "]";
	}
	
}

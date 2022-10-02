package com.gs.patterns;

public class UserPojo {

	private String firstName, lastName;
	private int age;
	private String phone;

	public UserPojo() {
		super();
	}

	// By using getters and setters we are loosing immutability 
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserPojo [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ "]";
	}

	
}

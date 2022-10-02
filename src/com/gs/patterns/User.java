package com.gs.patterns;

public class User {

	public static class UserBuilder {
		private String firstName, lastName; // mandatory
		private int age;
		private String phone;

		// The mandatory fields should be included in constructor
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

	private final String firstName, lastName;
	private final int age;
	private final String phone;

	private User(UserBuilder userBuilder) {
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.age = userBuilder.age;
		this.phone = userBuilder.phone;
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
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone + "]";
	}

}

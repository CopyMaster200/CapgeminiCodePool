package com.gs.streams;

public class Person {
	private final String name;
	private final Integer age;
	private final Gender gender;

	public Person(String name, Integer age, Gender gender) {
		this.age = age;
		this.gender = gender;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}

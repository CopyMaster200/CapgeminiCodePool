package com.gs.inbuilt;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) throws MinorAgeException, InvalidAgeException {
		int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		sc.close();
		if(age < 18) {
			throw new MinorAgeException("Age is less than 18");
		}else if(age > 100) {
			throw new InvalidAgeException("Age is invalid.");
		}else {
			System.out.println("Your age is valid.");
		}
	}
}

class MinorAgeException extends Exception {
	public MinorAgeException(String str) {
		super(str);
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}
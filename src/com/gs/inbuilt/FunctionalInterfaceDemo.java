package com.gs.inbuilt;

/* A functional interface is an interface that contains only one abstract method. 
 * They can have only one functionality to exhibit. From Java 8 onwards, 
 * lambda expressions can be used to represent the instance of a functional interface.
 * A functional interface can have any number of default methods. */

@FunctionalInterface
interface Square {
	int calculate(int x);
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		int a = 5;
		Square s = (x) -> x * x;
		System.out.println(s.calculate(a));
	}
}

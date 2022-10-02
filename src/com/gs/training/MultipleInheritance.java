package com.gs.training;

public class MultipleInheritance extends A{
	//suppose if it were  
	//Ambiguity - Compiler will get confused.(Diamond Problem)
	public static void main(String args[]) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.msg();// Now which msg() method would be invoked?
	}
}

class A {
	void msg() {
		System.out.println("Hello");
	}
}

class B {
	void msg() {
		System.out.println("Welcome");
	}
}
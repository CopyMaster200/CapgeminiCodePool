package com.gs.training;

public class Polymorphism {
	public static void main(String[] args) {
		Z b = new Z();
		b.method1();
	}
}
//Runtime / Compiletime ?
// Static / Dynamic
class D{
	public String method1() {
		return "method1";
	}
	
	public String method1(int i) {
		return "method1"+i;
	}
}

class Z extends D{
	public String method1() {
		return "method1";
	}
}


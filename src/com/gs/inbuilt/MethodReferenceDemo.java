package com.gs.inbuilt;

interface interface_default {
	void display();
}

class derived_class {

	public static void classMethod() {
		System.out.println("Derived class Method");
	}
}

class MethodReferenceDemo {
	public static void main(String[] args) {
		derived_class obj1 = new derived_class();
//		interface_default ref = obj1::classMethod;
		interface_default ref = derived_class::classMethod;//derived_class.classMethod();
		ref.display();
	}
}

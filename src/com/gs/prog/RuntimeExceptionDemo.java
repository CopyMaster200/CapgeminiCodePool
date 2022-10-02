package com.gs.prog;

/*If a method throws NullPointerException in the superclass, 
 * can we override it with a method which throws RuntimeException*/
public class RuntimeExceptionDemo {

}

class First {
	void method() throws NullPointerException {
	}
}

class Second extends First {
	void method() throws RuntimeException {
	}
}
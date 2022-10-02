package com.gs.prog;

public class ThrowAndThrowsDemo {
	public static void main(String[] args) throws InterruptedException {
		int numerator = 1, denominator = 0;
		if(numerator > 0 && denominator <= 0) {
			throw new DivideByZeroException("Divide by zero error");
		}
	
		Thread.sleep(10000);
		System.out.println("Hello Geeks");
	}

}

class DivideByZeroException extends ArithmeticException {

	private static final long serialVersionUID = 1L;

	public DivideByZeroException(String message) {
		super(message);
	}
}


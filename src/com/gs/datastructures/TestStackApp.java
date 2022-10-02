package com.gs.datastructures;

import java.util.Stack;

class TestStackApp {
	Stack<String> stack = new Stack<>();

	public static void main(String[] args) {

		TestStackApp app = new TestStackApp();
		app.stackCards();
		System.out.println("After Stacking up: " + app.isHaving("one"));
		app.unStackCards();
		System.out.println("After Unstacking: " + app.isHaving("one"));

	}

	public void stackCards() {
		stack.push("one");
		stack.push("two");
		stack.push("three");
	}

	public void unStackCards() {
		while (stack.size() > 0) {
			System.out.println(stack.pop());
		}
	}

	public boolean isHaving(String item) {
		return stack.contains(item);
	}
}
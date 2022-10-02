package com.gs.datastructures;

class DummyStackApp {
	DummyStack<String> stack = new DummyStack<>();

	public static void main(String[] args) {

		DummyStackApp app = new DummyStackApp();
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
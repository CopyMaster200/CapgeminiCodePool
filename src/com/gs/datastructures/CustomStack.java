package com.gs.datastructures;

import java.util.ArrayList;
import java.util.Stack;

class CustomStack {

	Stack<Integer> stk;
	ArrayList<Integer> min;
	int pointer = -1;

	public CustomStack() {
		stk = new Stack<>();
		min = new ArrayList<>();
	}

	public void push(Integer item) {

		if (stk.isEmpty()) {
			min.add(item);
			stk.push(item);
			pointer++;
			return;
		}
		if (item < min.get(pointer)) {
			min.add(item);
			stk.push(item);
			pointer++;
		} else {
			stk.push(item);
		}
	}

	public Integer pop() {
		if (stk.isEmpty()) {
			System.out.println("Stack is empty.");
		}
		Integer temp = stk.pop();
		if (temp == min.get(pointer)) {
			pointer--;
		}
		return temp;
	}

	public Integer peek() {
		return stk.peek();
	}

	public Integer getMin() {
		return min.get(pointer);
	}
}
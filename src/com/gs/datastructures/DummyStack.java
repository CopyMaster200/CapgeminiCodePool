package com.gs.datastructures;

import java.util.ArrayList;

class DummyStack<X> {

	private ArrayList<X> data;
	private int pointer;

	public DummyStack() {
		data = new ArrayList<X>();
		pointer = 0;
	}

	public void push(X newItem) {
		pointer++;
		data.add(newItem);
	}

	public X pop() {
		if (pointer == 0) {
			throw new IllegalStateException("No more items on the stack");
		}
		return data.remove(--pointer);
	}

	public boolean contains(X item) {
		return data.contains(item);
	}

	public X access(X item) {
		while (pointer > 0) {
			X temp = pop();
			if (temp.equals(item)) {
				return temp;
			}
		}
		throw new IllegalStateException("Could not found the item on the stack" + item);
	}

	public int size() {
		return pointer;
	}
}
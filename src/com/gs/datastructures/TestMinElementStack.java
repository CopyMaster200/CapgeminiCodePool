package com.gs.datastructures;

class TestMinElementStack {
	public static void main(String[] args) {
		CustomStack st = new CustomStack();
		st.push(3);
		st.push(5);
		System.out.println(st.getMin());
		st.push(2);
		st.push(1);
		st.pop();
		System.out.println(st.getMin());
	}

}

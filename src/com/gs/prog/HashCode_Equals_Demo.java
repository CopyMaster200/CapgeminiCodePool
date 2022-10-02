package com.gs.prog;

import java.util.ArrayList;

class HashCode_Equals_Demo {
	public static void main(String[] args) {
		ArrayList<Students> als = new ArrayList<>();

		Students s1 = new Students(2, "Mahesh", 65);
		Students s2 = new Students(2, "Mahesh", 65);

		System.out.println("Objects Comparision: " + s1.equals(s2));

		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}

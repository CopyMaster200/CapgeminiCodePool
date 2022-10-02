package com.gs.java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner str = new StringJoiner(",", "[", "]");
		str.add("Suresh");
		str.add("Mahesh");
		
		System.out.println(str);
	}
}

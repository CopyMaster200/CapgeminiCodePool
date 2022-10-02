package com.gs.prog;

import java.util.ArrayList;
import java.util.Collections;

public class FirstUniqueCharacter {
	public static void main(String[] args) {
		String input = "aabccdd";
		for (int i = 0; i < input.length(); i++) {
			if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))) {
				System.out.println(input.charAt(i));
				break;
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.synchronizedList(list);
		
	}
}

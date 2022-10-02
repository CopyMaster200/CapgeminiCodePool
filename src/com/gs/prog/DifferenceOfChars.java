package com.gs.prog;

import java.util.ArrayList;
import java.util.List;

public class DifferenceOfChars {

	public static void main(String[] args) {
		String given = "abcdefghijklmnopqrstuvwxyz";
		String input = "Online test with GS client";
//		String input = "The quick brown fox jumps over the lazy dog";
		diffOfChars(given,input.toLowerCase());
	}

	private static void diffOfChars(String given,String input) {
		List<Character> lst = new ArrayList<>();
		for(int i=0;i<given.length();i++) {
			if(input.indexOf(given.charAt(i)) < 0) {
				lst.add(given.charAt(i));
			}
		}
		if(lst.isEmpty()) {
			System.out.println("It's an anagram");
		}else {
			System.out.println("Characters which are missing to become anagram: "+lst);
		}
	}
}

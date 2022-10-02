package com.gs.prog;

import java.util.HashSet;

/* 
9. Find out unique substring of given length of string.
EX:
Input - (aab,2) , Output - aa, ab
Input- (aabc,2), Output - aa, ab,bc
Input -(abc,1), Output - abc
*/

class UniqueSubString {
	public static void main(String[] args) {
		String str = "aab";
		int len = 2;
		if (len == 1) {
			System.out.println(str);
			return;
		}
		HashSet<String> set = new HashSet<>();
		try {
			for (int i = 0; i < str.length(); i++) {
				set.add(str.substring(i, i + 2));
			}
		} catch (Exception e) {
		}
		System.out.println(set);
	}
}
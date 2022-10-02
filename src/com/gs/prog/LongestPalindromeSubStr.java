/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */
package com.gs.prog;

import java.util.Stack;

/* 
* Problem Statement: Longest Palindrome substring
Input: Given string :"forgeeksskeegfor", 
Output: "geeksskeeg"
**/

class LongestPalindromeSubStr {

	public static void main(String[] args) {
		
//		Stack - LIFO
		
		String str = "forgeeksskeegfor";// "forgeeksskeegfor";
		Stack<Character> stk = new Stack<>();
		int len = str.length();
		for (int i = 0; i < (len / 2); i++) {
			stk.push(str.charAt(i));
		}
		int mark = 0, end = 0;
		for (int j = len / 2; j < len; j++) {
			if (stk.peek() == str.charAt(j)) {
				stk.pop();
				if (mark == 0)
					mark = j;
			} else {
				end = j;
				break;
			}
		}
		if (mark <= 0) {
			System.out.println("Palindrome not found");
		} else {
			StringBuilder temp = new StringBuilder(str.substring(mark, end));
			System.out.println(temp.reverse());
		}
	}
}
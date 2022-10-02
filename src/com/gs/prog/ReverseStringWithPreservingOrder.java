/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */
package com.gs.prog;

import java.util.LinkedList;

/* 
* Problem Statement: Find Reverse String With Preserving Order.
Ex:
  Input = abcd, output = dcba
  Input = I am Java Developer, Output  = r ep olev eDavajamI
**/

class ReverseStringWithPreservingOrder {

	public static void main(String[] args) {
		String str = "I am Java Developer";
		String dup = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			dup += str.charAt(i);
		}
		dup = dup.replaceAll(" ", "");

		char[] ch = dup.toCharArray();
		LinkedList<Character> charList = new LinkedList<>();
		for (int i = 0; i < dup.length(); i++) {
			charList.add(i, dup.charAt(i));
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				charList.add(i, str.charAt(i));
			}
		}
		charList.stream().forEach(System.out::print);
	}
}
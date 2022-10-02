package com.gs.prog;

import java.util.Stack;

/* 
* Problem Statement: 

**/

class ValidParanthesis {

	public static void main(String[] args) {
		System.out.println(isValid("([)]"));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (ch) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;
			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;
			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}
}
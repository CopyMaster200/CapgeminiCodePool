package com.gs.prog;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* Find out the first non-repeating character from the given array of
* String.
* 
* Ex:
* Input : { "array", "apple", "rat"}
* Output: y,a,r
*
*/

class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String[] arr = { "array", "apple", "rat" };
		ArrayList<Character> cList = new ArrayList<>();
		List<Character> lst = new ArrayList<>();
		for (String str : arr) {
			cList.add(findFirstNonRepeatingChar(str));
			lst.add(findFirstNonRepeatingCharWithString(str));
		}
		System.out.println("Using String Function: " +lst);
		System.out.println("Using HashMap: " +cList);
		
	}

	private static Character findFirstNonRepeatingCharWithString(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				return str.charAt(i);
			}
		}
		return null;
	}

	private static Character findFirstNonRepeatingChar(String input) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (map.containsKey(input.charAt(i))) {
				int temp = map.get(input.charAt(i));
				temp++;
				map.put(input.charAt(i), temp);
			} else {
				map.put(input.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}
}
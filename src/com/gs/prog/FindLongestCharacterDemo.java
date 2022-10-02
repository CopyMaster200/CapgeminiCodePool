package com.gs.prog;
/* 
* Problem Statement:
For the given string such as "aabbbbbccbb" 
print the longest occurring character,index and number of times it occurs.
Ex: longest occurring character is b and length is 5 at index 2.
*/

class FindLongestCharacterDemo {
	public static void main(String[] args) {
		String input = "aabbbbbccbb";
		int index = 0, max = 1, highIndex = 0;
		Character maxChar = input.charAt(index);
		int counter = 1;
		for (int i = 0; i < input.length(); i++) {
			index = i;
			try {
				if (input.charAt(i) != input.charAt(i + 1)) {
					counter = 0;
				}
				counter++;
			} catch (Exception e) {}

			if (max < counter) {
				highIndex = index - counter + 2;
				max = counter;
				maxChar = input.charAt(index);
			}
		}
		System.out.println("longest occurring character is " + maxChar + " and length is " + max + " at index " + (highIndex));
	}
}
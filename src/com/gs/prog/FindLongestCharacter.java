/* Question: For the given string such as "aabbbbbccbb" 
* print the longest occurring character,index and number of times it occurs.
* Ex: longest occurring character is b and length is 5 at index 2.
*/
package com.gs.prog;

class FindLongestCharacter {
	public static void main(String[] args) {
		String input = "aabbbbbccbb";
		int index = 0, max = 1;
		Character maxChar = input.charAt(index);
		int counter = 1;
		for (int i = 0; i < input.length(); i++) {
			counter = 1;
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) != input.charAt(j)) {
					break;
				}
				counter++;
			}
			if (counter > max) {
				max = counter;
				maxChar = input.charAt(i);
				index = i;
			}
		}
		System.out.println("longest occurring character is " + maxChar + " and length is " + max + " at index " + index);
	}
}
package com.gs.prog;

/*
* Question: For the given string such as "aabbbbccaa" 
* Print the running length 
* O/P: a2b4c2a2
*/

public class RunLengthOfStringDemo {

	public static void main(String[] args) {
		String str = "aabbbbccaa";
		runLengthOfString(str);
	}

	private static void runLengthOfString(String str) {
		int n = str.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			count = 1;
			while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			System.out.print(str.charAt(i) + "" + count);
		}
	}
}

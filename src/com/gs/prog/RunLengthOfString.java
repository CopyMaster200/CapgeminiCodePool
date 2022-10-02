/*
 * Click `Run` to execute the snippet below!
 */
package com.gs.prog;

/*
* Question: For the given string such as "aabbbbccaa" 
* Print the running length 
* O/P: a2b4c2a2
*/

class RunLengthOfString {
	public static void main(String[] args) {
		String str = "aabbbbccaa";
		runLengthOfString(str);
	}

	private static void runLengthOfString(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			try {
				if (str.charAt(i) != str.charAt(i + 1)) {
					sb.append(str.charAt(i)).append(count);
					count = 0;
				}
				count++;
			} catch (Exception e) {
				sb.append(str.charAt(i)).append(count);
			}
		}
		System.out.println(sb);
	}
}

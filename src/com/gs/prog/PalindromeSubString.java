package com.gs.prog;

public class PalindromeSubString {
	
	public static void main(String[] args) {
		System.out.println(countSubstrings("madam"));
	}
	
	public static int countSubstrings(String s) {
		boolean[][] dp = new boolean[s.length()][s.length()];
		int count = 0;

		for (int gap = 0; gap < s.length(); gap++) {
			for (int i = 0, j = gap; j < s.length(); j++, i++) {
				if (gap == 0) {
					dp[i][j] = true;
				} else if (gap == 1) {
					if (s.charAt(i) == s.charAt(j)) {
						dp[i][j] = true;
					} else {
						dp[i][j] = false;
					}
				} else {
					if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == true) {
						dp[i][j] = true;
					} else {
						dp[i][j] = false;
					}
				}
				if (dp[i][j] == true) {
					count++;
				}
			}
		}
		return count;

	}
}
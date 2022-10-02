package com.gs.prog;

/* 
7. Little girl has 5 ten rupee coins, 10 two rupee coins and 50 five rupee coins.
 The needs 50 rupees out of this. Write a program to find all possible ways the girl can make 50 rupees.
*/

public class CoinCountProbability {

	public static void main(String[] args) {
		int[] coins = { 10, 2, 5 };
		int[] frequency = { 5, 10, 50 };
		int target = 50;
		int sum = 0, count = 0;
		String str = "";
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 10; j++) {
				for (int k = 0; k <= 50; k++) {
					sum = sum + (i * 10 + j * 2 + k * 5);
					if (sum == target) {
						str += i == 0 ? "" : i + " times 10 coins ";
						str += j == 0 ? "" : j + " times 2 coins ";
						str += k == 0 ? "" : k + " times 5 coins";
						System.out.println(str);
						count++;
					}
					str = "";
					sum = 0;
				}
			}
		}
		System.out.println("Number of possibilities: " + count);
	}
}

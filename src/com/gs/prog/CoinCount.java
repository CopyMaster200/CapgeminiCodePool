package com.gs.prog;

import java.util.ArrayList;
import java.util.List;

public class CoinCount {

	static List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		int[] coins = { 10, 2, 5 };
		int[] frequency = { 5, 10, 50 };
		int target = 50;
		func(coins, frequency, target, 0, "");
		System.out.println("\n Total possible ways :- " + list.size());
	}

	static void func(int[] coins, int[] frequency, int sum, int i, String result) {
		if (sum == 0) {
			System.out.println(result);
			list.add(result);
			return;
		}
		if (i == coins.length || sum < 0)
			return;
		for (int k = 0; k <= frequency[i]; k++) {
			String str = result;
			if (k != 0)
				str += " " + k + " times " + coins[i] + " coins";
			func(coins, frequency, sum - k * coins[i], i + 1, str);
		}
	}
}

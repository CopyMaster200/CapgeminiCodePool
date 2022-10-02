package com.gs.prog;

public class RainWaterTrappingDemo {

	public static void main(String[] args) {
		int result = rainWater(new int[] { 3, 1, 2, 4, 0, 1, 3, 2 });
		System.out.println(result);		//{ 3, 3, 3, 4, 4, 4, 4, 4 }
										//{ 4, 4, 4, 4, 3, 3, 3, 2 }
										//{ 0, 2, 1, 0, 3, 2, 0, 0 }
	}

	private static int rainWater(int[] units) {
		int n = units.length;
		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = units[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], units[i]); // [3,3,3,4,4,4,4,4]
		}

		right[n - 1] = units[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], units[i]);
		}

		int ret = 0;
		for (int i = 0; i < n; i++) {
			ret += Math.min(left[i], right[i]) - units[i];
		}
		return ret;
	}
}

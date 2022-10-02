package com.gs.prog;

public class IsPowerOf10 {

	public static void main(String[] args) {
		Boolean res = isPowerOf10(100);
		Boolean ret = isPowerOfTen(1010);
		System.out.println("Using math: "+res);
		System.out.println("Using while: "+ret);
		System.out.println("Power of number: "+isPowerOfNum(80, 9));
	}

	private static Boolean isPowerOf10(int inp) {

		int n = (int) Math.log10(inp);
		for (int i = 1; i <= n; i++) {
			if (inp % 10 == 0) {
				inp = inp / 10;
			} else {
				break;
			}
		}
		return inp == 1 ? true : false;
	}

	private static Boolean isPowerOfTen(int num) {
		while (num % 10 == 0) {
			num = num / 10;
		}
		return num == 1 ? true : false;
	}
	
	private static Boolean isPowerOfNum(int num, int power) {
		while (num % power == 0) {
			num = num / power;
		}
		return num == 1 ? true : false;
	}
}

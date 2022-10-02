package com.gs.prog;

public class RobbingAdjacentHouseProblem {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 9, 3, 1 };
				  //  0  1  2  3  4
		findTheSum(arr);
		
		findTheSum(new int[]{1,2,3,1});
	}

	private static void findTheSum(int[] arr) {
		int evenSum = 0, oddSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}
		//ternary
		System.out.println(evenSum < oddSum ? oddSum : evenSum);
	}
}

package com.gs.prog;

import java.util.Arrays;

public class MaxProductFromSubArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		Arrays.sort(arr);
		int length = arr.length - 1, product = 1;
		for (int i = length; i > length - 3; i--) {
			product *= arr[i];
		}
		System.out.println(product);
	}
}

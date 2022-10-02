package com.gs.prog;

import java.util.Arrays;

public class ZeroAtEnd {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 }; // 1, 2, 4, 3, 5, 0, 0, 0
		int arr1[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
		// space complexity O(1).
		zero(arr1);
		
		usingDuplicateArray(arr);
	}

	private static void usingDuplicateArray(int[] arr) {
		int dup[] = new int[arr.length];
		int index = 0;
		for (int i : arr) {
			if (i != 0) {
				dup[index++] = i;
			}
		}
		System.out.println(Arrays.toString(dup));
	}

	private static void zero(int[] arr) {
		int j, n = arr.length - 1;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			j = i;
			while (j < n - 1 && arr[j] == 0) {
				j++;
			}
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

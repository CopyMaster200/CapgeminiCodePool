package com.gs.prog;

public class MergeTwoArraysInSortedWay {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 2, 4, 6, 8, 10 };

		merge(arr1, arr2, arr1.length, arr2.length);
	}

	private static void merge(int[] arr1, int[] arr2, int l1, int l2) {
		int[] arr3 = new int[l1 + l2];
		int i = 0, j = 0, k = 0;
		while (i < l1 && j < l2) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		while (i < l1)
			arr3[k++] = arr1[i++];

		while (j < l2)
			arr3[k++] = arr2[j++];

		for (int x : arr3) {
			System.out.println(x);
		}

		// IntStream.of(arr3).forEach(System.out::println);
	}
}
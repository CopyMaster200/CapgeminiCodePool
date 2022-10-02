package com.gs.testcases;

import java.util.HashSet;

public class LengthOfCycle {

	static int countLengthOfCycle(int arr[], int startIndex) {

		if (startIndex > arr.length) {
			return -1;
		}
		int index = arr[startIndex];
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i <= arr.length; i++) {
			if (set.contains(index)) {
				return set.size();
			} else {
				set.add(index);
			}
			index = arr[index];
		}
		return -1;
	}

	static boolean doTestPass() {
		int[] arr1 = { 1, 0 };
		int[] arr2 = { 1, 2, 0 };

		if (!(countLengthOfCycle(arr1, 0) == 2) || !(countLengthOfCycle(arr2, 0) == 3)) {
			System.out.println("Test failed....");
			return false;
		}
		if (!(countLengthOfCycle(arr1, 1) == 2) || !(countLengthOfCycle(arr2, 1) == 3)) {
			System.out.println("Test failed....");
			return false;
		}
		if (!(countLengthOfCycle(arr2, 2) == 3)) {
			System.out.println("Test failed....");
			return false;
		}

		System.out.println("Test passed....");
		return true;

	}

	public static void main(String[] args) {
		doTestPass();
	}

}

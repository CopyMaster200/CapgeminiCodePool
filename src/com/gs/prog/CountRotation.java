package com.gs.prog;

public class CountRotation {
	static int countLengthOfCycle(int arr[], int startIndex) {
		if (startIndex == 0)
			return arr.length;
		else if (startIndex < arr.length - 1)
			return startIndex + 1;
		else
			return startIndex;
	}

	static boolean doTestPass() {
		int[] arr1 = { 1, 0 };
		int[] arr2 = { 1, 4, 0 };
		if (!(countLengthOfCycle(arr1, 0) == 2) || !(countLengthOfCycle(arr2, 0) == 3)) {
			System.out.println("Test failed....");
			return false;
		}
		if (!(countLengthOfCycle(arr1, 1) == 1) || !(countLengthOfCycle(arr2, 1) == 2)) {
			System.out.println("Test failed....");
			return false;
		}
		if (!(countLengthOfCycle(arr2, 2) == 2)) {
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
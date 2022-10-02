package com.gs.prog;
/* 
Given two arrays. Arr1 = {1,2,3,8}, arr2 = {5,6,4,7}. 
Find a number from each array to be interchanged to reach a common sum of all elements for both arrays. 
Output: {1,5} or {3,7} or {2,6} 
*/

class BalanceArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 8 }, arr2 = { 5, 6, 4, 7 };
		int sum1 = sumOfElements(arr1);
		int sum2 = sumOfElements(arr2);
		balanceArraysWithInterchange(arr1, sum1, arr2, sum2);
	}

	private static void balanceArraysWithInterchange(int[] arr1, int sum1, int[] arr2, int sum2) {
		int temp1 = 0, temp2 = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				temp1 = sum1 - arr1[i] + arr2[j];
				temp2 = sum2 + arr1[i] - arr2[j];
				if (temp1 == temp2) {
					System.out.println("{" + arr1[i] + "," + arr2[j] + "}");
				}
				temp1 = temp2 = 0;
			}
		}
	}

	private static int sumOfElements(int[] arr) {
		int tot = 0;
		for (int ele : arr) {
			tot += ele;
		}
		return tot;
	}
}
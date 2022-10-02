package com.gs.prog;

import java.util.Arrays;

/* 
* Problem Statement: 
Given an array of n integers where each value represents the number of chocolates in a 
packet. Each packet can have a variable number of chocolates. There are m students, 
the task is to distribute chocolate packets such that: 

* Each student gets one packet.
* The difference between the number of chocolates in the packet with maximum chocolates 
* and packet with minimum chocolates given to the students is minimum.

Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
Output: Minimum Difference is 6 
Explanation:
The set goes like 3,4,7,9,9 and the output 
is 9-3 = 6
*/

class Chocolates {
	public static void main(String args[]) { // {1,3,4,7,9,9,12,56}
		int arr[] = { 3, 4, 1, 9, 56, 7, 9, 12 }, m = 5;
		Arrays.sort(arr);
//		findMinDiffChoco(arr,m);
		findMinDifference(arr, m);
	}

	private static void findMinDiffChoco(int[] arr, int m) {
		int min = arr[arr.length - 1], index = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				int temp = arr[m + i - 1] - arr[i];
				if (temp < min) {
					min = temp;
					index = i;
				}
			} catch (Exception e) {
			}
		}
		System.out.println("Minimum difference is:" + min);
		for (int i = index; i <= index + m - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void findMinDifference(int[] arr, int m) {
		int min = Integer.MAX_VALUE;
		// 1 3 5 7 9 9 12 56
		try {
			for (int i = 0; i < arr.length; i++) {
				if (arr[m - 1 + i] - arr[i] < min) {
					min = arr[m - 1 + i] - arr[i];
				}
			}
			System.out.println("The min diff: " + min);
		} catch (Exception e) {
			System.out.println("The min diff: " + min);
		}
	}
}
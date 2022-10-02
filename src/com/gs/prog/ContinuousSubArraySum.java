package com.gs.prog;

public class ContinuousSubArraySum {
	public static void main(String[] args) {
		int[] arr = { 12, 7, 29, 6, 2, 11, 4, 8 };
		int k = 8;
		int n = arr.length;
		int res = 0;
		int start, end;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			start = i;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				if (sum == k) {
					res++;
					end = j;
					for (int p = start; p <= end; p++) {
						System.out.print(arr[p] + " ");
					}
					System.out.println();
				}
			}
		}
		System.out.println("Number of sub arrays: " + res);
	}
}

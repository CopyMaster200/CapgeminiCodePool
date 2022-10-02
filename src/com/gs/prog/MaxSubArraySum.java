package com.gs.prog;

public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int max = 0, sum = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (max < sum) {
				max = sum;
				start = s;
				end = i;
			}
			if (sum < 0) {
				sum = 0;
				s = i + 1;
			}
		}

		System.out.println(max);
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

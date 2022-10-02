package com.gs.prog;

public class AbsoluteSumOfSubArray {

	public static void main(String[] args) {

		int[] arr = { 1, -3, 2, 3, -4 };
		int sum=0,max=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(max < sum) {
				max = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		
		System.out.println(Math.abs(max));
	}
}

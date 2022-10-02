package com.gs.prog;

/*
Given an integer array nums, find a contiguous non-empty sub array within the array that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
A sub array is a contiguous subsequence of the array.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a sub array.
*/

public class MaxProductSubArray {
	public static void main(String[] args) {
		int[] nums = { 2, 3, -2, 4 };
		int product = 1, max = 0, start = 0, end = 0, s = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			product = product * nums[i];
			if (max < product) {
				max = product;
				start = s;
				end = i;
			}
			if (product < 0) {
				product = 0;
				s = i + 1;
			}
		}

		System.out.println("Product-->" + max);
		if (max != 0) {
			System.out.print("sub array-->");
			for (int i = start; i <= end; i++) {
				System.out.print(nums[i] + " ");
			}
		}
	}
}

package com.gs.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Count of Smaller Numbers After Self
Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
 */
public class SmallerNumNextToSelf {

	public static void main(String[] args) {
		List<Integer> retVal = countSmaller(new int[] {5,2,6,1});
		List<Integer> checkVal = Arrays.asList(new Integer[] {2,1,1,0});
		
		if(retVal.containsAll(checkVal)) {
			System.out.println("Test passed");
		}else {
			System.out.println("Failed");
		}
	}
	
	public static List<Integer> countSmaller(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		for (int i = nums.length - 1; i >= 0; i--) {
			if (sorted.isEmpty()) {
				sorted.add(nums[i]);
				result.add(0);
			} else if (nums[i] > sorted.get(sorted.size() - 1)) {
				sorted.add(sorted.size(), nums[i]);
				result.add(sorted.size() - 1);
			} else {
				int l = 0;
				int r = sorted.size() - 1;

				while (l < r) {
					int m = l + (r - l) / 2;

					if (nums[i] > sorted.get(m)) {
						l = m + 1;
					} else {
						r = m;
					}
				}
				sorted.add(r, nums[i]);
				result.add(r);
			}
		}

		Collections.reverse(result);

		return result;
	}
}

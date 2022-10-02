package com.gs.prog;

import java.util.ArrayList;

/* 
countLengthOfCycle(arr, startIndex)

You are given an integer array of size N. 
Every element of the array is greater than or equal to 0.
Starting from arr[startIndex], follow each element to the index it points to. 
Continue to do this until you find a cycle. 
Return the length of the cycle. If no cycle is found return -1

Examples:
countLengthOfCycle([1, 0], 0) == 2
countLengthOfCycle([1, 2, 0], 0) == 3
*/

class LengthOfCycle {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
//					  0  1  2
//		1 2 2 2 2 2 2 2
		int pos = 0;
		System.out.println(countLengthOfCycle(arr, pos));
	}

	private static int countLengthOfCycle(int[] arr, int pos) {
		if (pos >= arr.length) {
			return -1;
		}
		int index = arr[pos];
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (i == arr[i]) {
				return 1;
			}
			if (list.contains(index)) {
				return list.size();
			} else {
				list.add(index);
			}
			index = arr[index];
		}
		return list.size();
	}
}
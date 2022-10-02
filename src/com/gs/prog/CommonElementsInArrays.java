package com.gs.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
* Problem Statement: 
Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a sorted array of only the integers that appeared in all three arrays in O(n). Make sure the time complexity is met.

Example 1:
Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
Output: [1,5]
Explanation: Only 1 and 5 appeared in the three arrays.
**/

class CommonElementsInArrays {
	public static void main(String args[]) {
		int[] arr1 = { 1, 5, 7, 9, 4 }, arr2 = { 1, 2, 12, 3, 4, 5, 3, 4, 9, 0 }, arr3 = { 1, 2, 3, 4, 5, 8, 2 };
		int n = findTheSize(arr1, arr2, arr3);
		commonElements(arr1, arr2, arr3, n);
	}

	private static void commonElements(int[] arr1, int[] arr2, int[] arr3, int n) {
		HashMap<Integer, Set<Character>> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				Set<Character> temp = map.get(arr1[i]);
				temp.add('a');
				map.put(arr1[i], temp);
			} else {
				Set<Character> lst = new HashSet<>();
				lst.add('a');
				map.put(arr1[i], lst);
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				Set<Character> temp = map.get(arr2[i]);
				temp.add('b');
				map.put(arr2[i], temp);
			} else {
				Set<Character> lst = new HashSet<>();
				lst.add('b');
				map.put(arr2[i], lst);
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			if (map.containsKey(arr3[i])) {
				Set<Character> temp = map.get(arr3[i]);
				temp.add('c');
				map.put(arr3[i], temp);
			} else {
				Set<Character> lst = new HashSet<>();
				lst.add('c');
				map.put(arr3[i], lst);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (Map.Entry<Integer, Set<Character>> entry : map.entrySet()) {
			// System.out.println(entry);
			if (entry.getValue().size() == 3) {
				list.add(entry.getKey());
			}
		}

		System.out.println(list);
	}

	private static int findTheSize(int[] arr1, int[] arr2, int[] arr3) {
		int l1 = arr1.length, l2 = arr2.length, l3 = arr3.length;
		int temp = l1 > l2 ? l1 : l2;
		return l3 > temp ? l3 : temp;
	}

}
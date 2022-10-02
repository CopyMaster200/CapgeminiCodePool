/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */
package com.gs.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* 
* Problem Statement: 
  Find the maximum value we can form from array with its elements.
  ex: arr = {7,4,80,9}
  o/p: 98074
*/

class FormMaxIntegerFromArray {
	public static void main(String args[]) {
		LinkedHashMap<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
		int[] arr = { 7, 4, 80, 9 };
		Arrays.sort(arr);
		for (int i = 9; i >= 0; i--) {
			map.put(i, new ArrayList<Integer>());
		}

		for (int i = 0; i < arr.length; i++) {
			int temp = Character.getNumericValue((arr[i] + "").charAt(0));
			if (map.containsKey(temp)) {
				ArrayList<Integer> al = map.get(temp);
				al.add(arr[i]);
				map.put(temp, al);
			}
		}

		ArrayList<Integer> newList = new ArrayList<>();
		for (ArrayList<Integer> alist : map.values()) {
			if (alist.size() > 0)
				newList.addAll(alist);
		}

		StringBuilder sb = new StringBuilder();
		for (Integer i : newList) {
			sb.append(i);
		}
		System.out.println(sb);
	}
}
package com.gs.prog;

import java.util.ArrayList;

public class MissingMinPositiveInteger {
	public static void main(String[] args) {
		int[] arr = { -1, 4, 5, 7, 3, 1, 1000 };
		arr = sort(arr);
		ArrayList<Integer> lst = new ArrayList<>();
		for (int i : arr) {
			lst.add(i);
		}
		System.out.println(lst);

		for (Integer n : lst) {
			int temp = n + 1;
			if (!lst.contains(temp)) {
				System.out.println("The missing minimum positive integer is: " + temp);
				break;
			}
		}
	}

	private static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			try {
				if (arr[i + 1] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					i = -1;
				}
			} catch (Exception e) {
			}
		}
		return arr;
	}
}
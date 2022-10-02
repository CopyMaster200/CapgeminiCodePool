package com.gs.prog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*2nd largest number from an array without using any in built functions*/

public class SecondLargestNum {

	public static void main(String[] args) {
		Integer[] arr = { 12, 5, 22, 31, 6 };
		secondLargestNumber(arr);
		arr = sort(arr);
		System.out.println("Second largest number: " + arr[1]);

	}

	private static Integer[] sort(Integer[] arr) {
		int temp = 0;
		try {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					i = -1;
				}
			}
		} catch (Exception e) {
		}
		return arr;
	}

	private static void secondLargestNumber(Integer[] arr) {
		List<Integer> lst = Arrays.asList(arr);
		int res = lst.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second largest number using streams: " + res);
	}
}

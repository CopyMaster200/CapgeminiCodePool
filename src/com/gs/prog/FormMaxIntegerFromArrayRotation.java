package com.gs.prog;

import java.util.ArrayList;
import java.util.List;

public class FormMaxIntegerFromArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 80, 9 };
		maxValUsingString(arr);
		maxVal(arr);
	}

	private static void maxValUsingString(int[] arr) {
		String str = new String();
		for (int ele : arr) {
			str = str + "" + ele;
		}
		str = str + str;
		int size = str.length() / 2;
		List<Integer> lst = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			lst.add(Integer.parseInt(str.substring(i, i + size)));
		}
		lst.stream().sorted();
		System.out.println(lst.get(lst.size() - 1));
		// System.out.println(lst.stream().mapToInt(v-> v).max());
	}

	private static void maxVal(int[] arr) {
		int n = arr.length;
		int[] dup = new int[n * 2];
		for (int i = n, j = 0; i < n * 2; i++, j++) {
			dup[j] = arr[j];
			dup[i] = arr[j];
		}
		int max = 0, maxIndex = 0;
		for (int i = 0; i < n; i++) {
			if (max < arr[i] % 10) {
				max = arr[i];
				maxIndex = i;
			}
		}
		for (int i = maxIndex; i < n + maxIndex; i++) {
			System.out.print(dup[i] + " ");
		}
	}

}
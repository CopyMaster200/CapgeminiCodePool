package com.gs.prog;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 7, 9, 2 };
		int[] arr2 = { 1, 7, 3, 8, 5, 5 };
		Set<Integer> dup = new HashSet<>();
		for (int i : arr1) {
			dup.add(i);
		}
		for (int i : arr2) {
			if (dup.contains(i)) {
				System.out.println(i);
			}
		}
	}
}
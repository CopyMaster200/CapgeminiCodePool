package com.gs.prog;

import java.util.ArrayList;
import java.util.List;

public class ArrayCycle {

	public static void main(String[] args) {
		// ([1, 2, 0], 0) == 3
		int[] array = { 1, 2, 2 };
		int startIndex = 0;
		System.out.println(findCyclicArraySize(array, startIndex));
	}

	private static int findCyclicArraySize(int[] array, int startIndex) {
		int i = startIndex;
		List<Integer> list = new ArrayList<>();
		while (i < array.length) {
			if (i == array[i]) {
				return 1;
			}
			if (list.contains(array[i])) {
				return list.size();
			} else {
				list.add(array[i]);
			}
			i = array[i];
		}
		return -1;
	}
}

package com.gs.prog;

import java.util.Arrays;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int[] arr = {12, 11, 13, 5, 6};
		int[] sortArr = new int[arr.length];
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if (sortArr.length != 0) {
				try {
					for (int j = 0; j < sortArr.length; j++) {
						if (arr[i] > sortArr[j]) {
							temp = sortArr[j];
							sortArr[j] = arr[i];
							arr[i] = temp;
						}
					}
				} catch (Exception e) {
				}
			}else {
				sortArr[i] = arr[i];
			}
		}
		
		Arrays.stream(sortArr).forEach(System.out::println);
	}
}

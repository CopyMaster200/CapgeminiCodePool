package com.gs.prog;

import java.util.Arrays;
import java.util.List;

public class Median {

	/*
 	12. Find the median of two sorted arrays of different size.
		Example:
		Input :
		Array 1: 2 3 6 7 9
		Array 2: -1 4 8 10
		Output : 6
		Hint: The final sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10 The 5th element of this array is 6.
	*/
	public static void main(String[] args) {
		int[] arr1 = {2, 3, 6, 7, 9};
		int[] arr2 = {-1, 4, 8, 10};
		int i=0;
		int[] arr3 = new int[arr1.length+arr2.length];
		arr3 = addElements(arr1, arr3, i);
		arr3 = addElements(arr2, arr3, arr1.length);
		Arrays.sort(arr3);
		Arrays.stream(arr3).forEach(x->{System.out.print(x+" ");});
		int n = (arr3.length+1)/2 - 1;
		System.out.println("\nMedian: "+arr3[n]);
	}
	private static int[] addElements(int[] arr,int[] res,int i){
		for(int ele: arr) {
			res[i++] = ele;
		}
		return res;
	}

}

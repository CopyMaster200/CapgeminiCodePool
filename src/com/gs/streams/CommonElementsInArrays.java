package com.gs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4 }, arr2 = { 3, 4, 5, 6 };

		List<Integer> lst1 = Arrays.asList(arr1);
		List<Integer> lst2 = Arrays.asList(arr2);
		
		List<Integer> commonElements = lst1.stream().filter(lst2::contains).collect(Collectors.toList());
		List<Integer> differentElements = lst1.stream().filter(x -> !lst2.contains(x)).collect(Collectors.toList());
		
		System.out.println("Common Elements:"+ commonElements);
		System.out.println("Different Elements:"+ differentElements);
		
		
	}

}

package com.gs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5}, b = {3,4,6,7};
		List<Integer> list1 = Arrays.asList(a);
		List<Integer> list2 = Arrays.asList(b);
		
		List<Integer> commonList = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println("Common elements in both the arrays: "+commonList);
		
		List<Integer> unMatched = list1.stream().filter(x -> !list2.contains(x)).collect(Collectors.toList());
		System.out.println("Un matched elements from array1: "+unMatched);
	}
}

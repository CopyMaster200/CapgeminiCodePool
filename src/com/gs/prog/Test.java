package com.gs.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		
		String str = "apple";
		System.out.println(Arrays.toString(str.split("")));
//		double res = 1.0 / 0.0;
//		System.out.println(res);

//		reverseArrayWithoutCollection();
//		createImmutableList();
//		reverseLinkedList();
//		numberCheckUsingRE();
//		tryWithResource();
		
//		C c = (C) new B(); // Class cast exception class B cannot be cast to class C 
//		System.out.println(c.str);

//		double DoubleValue = 3.6987;
//		int IntValue = (int) Math.floor(DoubleValue);
//		System.out.println(DoubleValue + " is now " + IntValue);
		
//		int[] primes = new int[10]; 
//		primes[0] = "a"; //compile time error
//
//		Object[] names = new Integer[3]; 
//		names[0] = "Suresh"; // ArrayStoreException at runtime
		
		
	}

	private static void tryWithResource() {
		Scanner sc = new Scanner(System.in);
		try (sc) {
			System.out.println("Enter a number:");
			sc.nextInt();
		} catch (Exception e) {
		}

		sc.nextLine(); // IllegalStateException: Scanner closed
	}

	private static void numberCheckUsingRE() {
		String str = "12345";
		Pattern pat = Pattern.compile(".*^[0-9].*");
		System.out.println(pat.matcher(str).matches());
	}

	private static void reverseLinkedList() {
		List<String> ll = new LinkedList<String>();
		ll.add("Suresh");
		ll.add("Mahesh");
		ll.add("Ramesh");
		Collections.reverse(ll);
		System.out.println(ll);
	}

	private static void createImmutableList() {
		List<String> lst = Arrays.asList(new String[] { "Test", "The", "Code" });
		System.out.println(lst);

		List<String> list = new ArrayList<>();
		list.add("Suresh");
		list.add("Mahesh");
		list.add("Ramesh");
		List<String> iList = Collections.unmodifiableList(list);
		iList.add("Satish");
		System.out.println(iList);
	}

	private static void reverseArrayWithoutCollection() {
		int[] arr = { 1, 2, 3, 4 };
		int[] revArr = new int[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			revArr[j] = arr[i];
		}
		System.out.println(Arrays.toString(revArr));
	}
}

class A {
	public String str = "A";
}

class B extends A {
	public String str = "B";
}

class C extends B {
	public String str = "C";
}

class TestStatic {
	public String nonStatic = "non-static";
	public static String temp = "temp";
}
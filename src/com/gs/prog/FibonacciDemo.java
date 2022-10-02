package com.gs.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciDemo {
	public static void main(String[] args) {
		System.out.println("Please enter the fibonacci number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println("The given number is " + isFibo(n) + " fibonacci");
	}

	private static boolean isFibo(int n) {
		return fiboSeries(n).contains(n) ? true : false;
	}

	private static List<Integer> fiboSeries(int n) {
		List<Integer> list = new ArrayList<>();
		int a = 0, b = 1, temp = 0;
		list.add(a);
		list.add(b);
		for (int i = 2; i <= n; i++) {
			temp = a + b;
			a = b;
			b = temp;
			list.add(temp);
			if (temp >= n) {
				break;
			}
		}
		System.out.println(list);
		return list;
	}
}

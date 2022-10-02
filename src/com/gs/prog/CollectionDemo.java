package com.gs.prog;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(3, 3);
		list.add(2);
		System.out.println(list);
	}
}

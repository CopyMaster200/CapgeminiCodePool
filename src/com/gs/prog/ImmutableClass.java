package com.gs.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableClass {

	public static void main(String[] args) {
		ImmutableList il = new ImmutableList();
		il.getList().add(5);
		System.out.println(il.getList());

		ImmutableArray ia = new ImmutableArray(new int[] { 0, 1, 2, 4, 5 });
		ia.getArray()[0] = 3;
		System.out.println(Arrays.toString(ia.getArray()));

		ImmutableArrayWithCollection test = new ImmutableArrayWithCollection(new Integer[] { 0, 1, 2, 4, 5 });
		test.getArray()[0] = 11;
		System.out.println(Arrays.toString(test.getArray()));
		
		List<Integer> lst = Arrays.asList(new Integer[] {1,2,3});
		Collections.unmodifiableList(lst);
		lst.add(10);
	}

}

final class ImmutableList { // If we declare final at class level it doesn't allow child objects to get created.
	private final List<Integer> list; 

	public ImmutableList() {
		list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
	}

	public List<Integer> getList() {
		return new ArrayList<Integer>(list);
	}
}

final class ImmutableArray {
	private final int[] array;

	public ImmutableArray(int[] arr) {
		this.array = arr;
	}

	public int[] getArray() {
		return Arrays.copyOf(array, array.length);
	}
}

final class ImmutableArrayWithCollection {
	private final List<Integer> lst;
	
	public ImmutableArrayWithCollection(Integer[] arr) {
		this.lst = Arrays.asList(arr);
	}

	public final Object[] getArray() {
		return lst.toArray();
	}
}
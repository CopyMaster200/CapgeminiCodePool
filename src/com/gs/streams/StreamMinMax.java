/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */
package com.gs.streams;

import java.util.ArrayList;
import java.util.List;

/* 
* Problem Statement: 

**/

class StreamMinMax {
	public static void main(String args[]) {

		List<Integer> numLst = new ArrayList<>();
		numLst.add(15);
		numLst.add(1);
		numLst.add(5);
		numLst.add(21);
		numLst.add(2);
		numLst.add(0);

		System.out.println("Using Streams:");
		numLst.stream().forEach(System.out::println);

		Integer min = numLst.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("Min: " + min);

		Integer max = numLst.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("Max: " + max);
	}
}
/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */
package com.gs.streams;

import java.util.ArrayList;
import java.util.List;

/* 
* Problem Statement: 
Iteration through collection using streams API.
**/

class StreamIteration {
	public static void main(String args[]) {
		List<String> alist = new ArrayList<>();
		alist.add("Ape");
		alist.add("Bear");
		alist.add("Cat");
		alist.add("Dog");

		System.out.println("Using For-each loop:");
		for (String str : alist) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println("Using Streams:");
		alist.stream().forEach(System.out::println);
	}
}
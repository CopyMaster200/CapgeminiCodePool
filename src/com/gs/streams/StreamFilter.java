
/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */
package com.gs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
* Problem Statement: 
Streams with filter
**/

class StreamFilter {
	public static void main(String args[]) {
		List<String> alist = new ArrayList<>();
		alist.add("Ape");
		alist.add("Bear");
		alist.add("Cat");
		alist.add("Dog");

		System.out.println("Using For-each loop:");
		for (String str : alist) {
			if (str.length() > 3)
				System.out.println(str);
		}
		System.out.println();

		System.out.println("Using Streams:");
		List<String> al = alist.stream().filter(e -> e.length() > 3).collect(Collectors.toList());
		System.out.println(al);
	}
}
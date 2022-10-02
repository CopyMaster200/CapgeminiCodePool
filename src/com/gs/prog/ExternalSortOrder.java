/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */
package com.gs.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* 
* Problem Statement: 
*Given a list of Strings, and an external order in which it needs to be sorted, Sort the given list of strings.
*For example:
*Input Strings :  "Ajay", "Raja", "Keshav", "List", "Set", "Elephant", "Drone"
*Sort order:  TESARDLK
*Sorted Strings: "Elephant", "Set","Ajay", "Raja", "Drone","List","Keshav"


*/

class ExternalSortOrder {
	public static void main(String args[]) {
		String sort = "TESARDLK";
		String[] arr = { "Ajay", "Raja", "Keshav", "List", "Set", "Elephant", "Drone" };
		System.out.println("Input Array: " + Arrays.asList(arr) + " \nSort Order: " + sort);
		sortArray(sort, arr);
	}

	private static void sortArray(String sort, String[] arr) {
		LinkedHashMap<Character, ArrayList<String>> map = new LinkedHashMap<>();
		for (int i = 0; i < sort.length(); i++) {
			map.put(sort.charAt(i), new ArrayList<String>());
		}

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i].charAt(0))) {
				ArrayList<String> al = map.get(arr[i].charAt(0));
				al.add(arr[i]);
				map.put(arr[i].charAt(0), al);
			}
		}
		ArrayList<String> newlist = new ArrayList<>();
		for (ArrayList<String> entry : map.values()) {
			newlist.addAll(entry);
		}

		System.out.println("Sorted Array: " + newlist);
	}
}
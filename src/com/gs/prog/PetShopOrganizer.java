/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */
package com.gs.prog;

import java.util.ArrayList;
import java.util.HashMap;

/* 
* Problem Statement: 
There is a pet shelter where accepts pets to be donated and give pets for adopt. while taking the donations pets will be maintained in order. 
(ex: Cat1,Dog1,Cat2, Dog2,Pet1,Cat3,Pet2..etc.). 
while giving for adoption based on the type the first occurrence of the specific pet type would be picked. If no specific type the first occurrence of any pet would be picked. Design the solutions for this problem
*/

class PetShopOrganizer {
	public static void main(String args[]) {
		String arr[] = { "Cat1", "Dog1", "Cat2", "Dog2", "Pet1", "Cat3", "Pet2" };
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String st = arr[i].replaceAll("[0-9]+", "");
			if (map.containsKey(st)) {
				ArrayList<String> lst = map.get(st);
				lst.add(arr[i]);
				map.put(st, lst);
			} else {
				ArrayList<String> list = new ArrayList<>();
				list.add(arr[i]);
				map.put(st, list);
			}
		}
		System.out.println(map);
	}
}
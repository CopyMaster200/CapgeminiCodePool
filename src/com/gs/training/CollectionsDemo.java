package com.gs.training;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollectionsDemo {

	public static void main(String[] args) {
		/*HashMap is a key value notation. 
		HashMap dosen't allow duplicate keys but duplicate values are allowed.
		If we try to insert the duplicate key it won't throw any error but the previous value will
		be replaced with the recent one. 
		*/
		Map<Integer,String> map = new HashMap<>();//16 [0-15]
		map.put(1,"Suresh");
		// key : 1 hashcode = 10298493%16 0 - 15 -> 4
		map.put(2,"Mahesh");
		map.put(3,"Ramesh");
		//Hash collision
		// key : 3 hashcode = 10298412%16 0 - 15 -> 4 -> hashcode() and equals().
		map.put(3,"Suresh");
		System.out.println(map);
		
//		[key|value|pointer to the next node]
		
		System.out.println("map get value "+map.get(1));
		System.out.println("map get value "+map.containsKey(5));
		
		//Map iteration
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		//To preserve insertion order.
		Map<Integer,String> linkedMap = new LinkedHashMap<>();
		linkedMap.put(3,"Suresh");
		linkedMap.put(2,"Mahesh");
		linkedMap.put(1,"Ramesh");
		System.out.println(linkedMap);
		
		//Natural Sorted order.
		Map<Integer,String> sortedMap = new TreeMap<>();
		sortedMap.put(4,"Suresh");
		sortedMap.put(1,"Mahesh");
		sortedMap.put(3,"Ramesh");
		sortedMap.put(2,"Jayesh");
		System.out.println(sortedMap);
 	}

}

package com.gs.prog;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string:");
		String str = sc.nextLine();
		// a p p l e
		// 0 1 2 3 4
		
		//indexOf(a) = 0 lastIndexOf(a) = 0 ~ 1
		//indexOf(p) = 1 lastIndexOf(p) = 2 ~ more 1
		//indexOf(l) = 3 lastIndexOf(l) = 3 ~ 1
		//indexOf(e) = 4 lastIndexOf(e) = 4 ~ 1
		
		Map<Character,Integer> map = new LinkedHashMap<>();//Preserve insertion order.
		
//	keys	values	
//		a -> 1
//		p -> 1+1 = 2
//		l -> 1
//		e -> 1
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				Integer temp = map.get(str.charAt(i)) + 1;
				map.put(str.charAt(i), temp);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		
		int counter = 0;
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				counter++;
				if(counter == 2) { // second non repeating character
					System.out.println(entry.getKey());
					break;
				}
			}
		}
	}
}

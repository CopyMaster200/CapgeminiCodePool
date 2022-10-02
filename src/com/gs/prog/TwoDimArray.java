package com.gs.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
For a given input 2D array of strings, find the maximum average grade, round off to the nearest floor integer.

Input :  {  {"Rohit", "85"},
            {"Rahul", "80"},
            {"Amit","85"},
            {"Rohit", "90"}   }
*/
class TwoDimArray {
	public static void main(String[] args) {
		String[][] arr = { { "Rohit", "85" }, { "Rahul", "80" }, { "Amit", "85" }, { "Rohit", "90" } };
		double max = 0.0, total;

		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> al;
			if (map.containsKey(arr[i][0])) {
				al = map.get(arr[i][0]);
				al.add(Integer.parseInt(arr[i][1]));
				map.put(arr[i][0], al);
			} else {
				al = new ArrayList<>();
				al.add(Integer.parseInt(arr[i][1]));
				map.put(arr[i][0], al);
			}
		}
		for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			// System.out.println(entry.getKey()+":"+entry.getValue());
			Integer temp = entry.getValue().stream().reduce(0, Integer::sum);
			total = (double) temp / entry.getValue().size();
			if (max < total) {
				max = total;
			}
		}
		if(max >= 0 ) {
			int floor = (int) Math.floor(max);
			System.out.println(floor);
		}else {
			String str = Double.toString(max);
			System.out.println(Double.toString(max).split(".")[0]);
		}
		
	}
}
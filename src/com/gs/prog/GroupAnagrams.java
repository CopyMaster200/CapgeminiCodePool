package com.gs.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an array of strings strs, group the anagrams together. 
 * You can return the answer in any order.An Anagram is a word or phrase formed by 
 * rearranging the letters of a different word or phrase, typically using all the 
 * original letters exactly once.
 * 
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 
 * */
public class GroupAnagrams {
	public static void main(String args[]) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> ret = new ArrayList<List<String>>();
		Map<String,ArrayList<String>> map = new HashMap<>();
		
		for(String str : strs) {
			char[] crs = str.toCharArray();
			Arrays.sort(crs);
			String sss = new String();
			for(char c : crs) {
				sss += c;
			}
			
			if(map.containsKey(sss)) {
				ArrayList<String> lst = map.get(sss);
				lst.add(str);
				map.put(sss, lst);
			}else {
				ArrayList<String> lst = new ArrayList<>();
				lst.add(str);
				map.put(sss, lst);
			}
		}
		
		for(Map.Entry<String,ArrayList<String>> entry : map.entrySet()) {
			ret.add(entry.getValue());
		}
		return ret;
	}
}

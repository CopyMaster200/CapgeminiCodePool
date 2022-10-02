package com.gs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class forEachDemo {
	public static void main(String[] args) {
		List<String> subList = new ArrayList<String>();
		subList.add("Carrot");
		subList.add("Potato");
		subList.add("Cauliflower");
		subList.add("LadyFinger");
		subList.add("Tomato");
		System.out.println("------------Vegetable List--------------");
		subList.forEach(sub -> System.out.println(sub));
		
		joinerDemo(subList);
	}
	
	public static void joinerDemo(List<String> list){
		System.out.println("\nJava 8 StringJoiner: ");
		StringJoiner sj = new StringJoiner(",", "[", "]");
		for (String st : list) {
			sj.add(st);
		}
		System.out.println(sj);
	}
}

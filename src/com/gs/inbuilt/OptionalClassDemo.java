package com.gs.inbuilt;

import java.util.Arrays;
import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		String[] str = new String[10];
		System.out.println(Arrays.toString(str));
		if(str[5] != null) {
			str[5].charAt(0);
		}
		str[5] = "Capgemini";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		
		if (checkNull.isPresent()) {
			String word = str[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("string is null");
	}
}
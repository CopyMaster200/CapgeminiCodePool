package com.gs.prog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class TicketsItenary {
	/*
	 * input: Banglore-> Hyderabad, mumbai -> delhi, delhi -> chennai, chennai -> Banglore
	 * 
	 * expected output:
	 * Mumbai->Delhi, Delhi->Chennai, Chennai->Banglore, Banglore->Hyderabad
	 */

	public static void main(String[] args) {
		// Don't consider the edge case.
		Map<String, String> map = new HashMap<>();
		map.put("Banglore", "Hyderabad");
		map.put("Mumbai", "Delhi");
		map.put("Delhi", "Chennai");
		map.put("Chennai", "Banglore");

		Set<String> keySet = map.keySet();
		Set<String> valueSet = new HashSet<>(map.values());

		// Using stream API, I will find source and then I will start iterating from source.
		String source = keySet.stream().filter(x -> !valueSet.contains(x)).collect(Collectors.toList()).get(0);
		//System.out.println(source);

		StringJoiner sj = new StringJoiner(", ");
		for (int i = 0; i < map.size(); i++) {
			if (map.containsKey(source)) {
				sj.add(source + "->" + map.get(source));
				source = map.get(source);
			}
		}
		System.out.println(sj);
	}

}

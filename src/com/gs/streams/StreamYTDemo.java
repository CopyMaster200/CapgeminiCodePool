package com.gs.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamYTDemo {
	
	public static void main(String[] args) {
		List<Person> people = getPeople();
		
		//Filter
		System.out.println("Filtered data on gender:");
		List<Person> female = people.stream().filter(p -> p.getGender().equals(Gender.FEMALE))
		.collect(Collectors.toList());
		female.forEach(System.out::println);
		
		List<Person> sortedAgeList = people.stream().sorted(Comparator.comparing(Person::getAge))
		.collect(Collectors.toList());
		System.out.println("Sorted list by age: ");
		sortedAgeList.forEach(System.out::println);

		//All Match
		boolean allMaleMatches = people.stream().allMatch(x-> x.getGender().equals(Gender.MALE));
		System.out.println("Do we have all males ? "+allMaleMatches);
		
		//Any Match
		boolean anyAgeMatches = people.stream().anyMatch(x-> x.getAge() >= 100);
		System.out.println("Do we have anyone with age greater than 100 ? "+anyAgeMatches);
		
		//NoneMatch
		boolean noneMatch = people.stream().noneMatch(x -> x.getGender().equals(Gender.TRANS));
		System.out.println("none of the list contains trans genders: "+noneMatch);
		
		//Max
		System.out.println("Person with Max age: ");
		people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
		
		//Min
		System.out.println("Person with Min age: ");
		people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
		
		//Grouping
		System.out.println("Group by genders: ");
		Map<Gender, List<Person>> groupByGender = people.stream().collect(Collectors.groupingBy(Person::getGender));
		groupByGender.forEach((gender, persons) -> {
			System.out.println(gender+":"+persons);
		});
		
		//Convert list to map
		Map<String, Person> tempMap = people.stream().collect(Collectors.toMap(x -> x.getName(), x->x));
		System.out.println("converted list to map: "+tempMap);
	}
	
	private static List<Person> getPeople(){
		return List.of(
				new Person("Iron Man", 55, Gender.MALE),
				new Person("Captain America", 97, Gender.MALE),
				new Person("Spider Man", 19, Gender.MALE),
				new Person("Black Widow", 38, Gender.FEMALE),
				new Person("Hulk", 60, Gender.MALE),
				new Person("Captain Marvel", 70, Gender.FEMALE),
				new Person("Thor", 155, Gender.MALE),
				new Person("Vision", 10, Gender.MALE),
				new Person("Scarlet Witch", 28, Gender.FEMALE)
				);
	}
 }

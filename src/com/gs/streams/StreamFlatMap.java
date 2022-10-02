package com.gs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFlatMap {

	public static void main(String[] args) {
		List<String> bingoNumbers = Arrays.asList("A01","B02","B03","G13","g05","G08","G09",
				"g01","g01","C06");

		long gBingoCount = bingoNumbers.stream()
				.map(String::toUpperCase)
				.filter(bingo->bingo.startsWith("G"))
				.distinct()
				.sorted(Collections.reverseOrder())
				.peek(System.out::println)
				.count();
		System.out.println(gBingoCount);
		
		
		Employee gov = new Employee("Govardhan", 25);
		Employee abc = new Employee("Abc", 26);
		Employee xyz = new Employee("Xyz", 27);
		Employee pqr = new Employee("Pqr", 24);
		
		Department hr = new Department("HR");
		hr.addEmployee(gov);
		Department account = new Department("Accounting");
		account.addEmployee(abc);
		account.addEmployee(xyz);
		account.addEmployee(pqr);
		
		List<Department> departments = new ArrayList<>();
		departments.add(hr);
		departments.add(account);
		
		departments.stream().flatMap(dept->dept.getEmployees().stream())
		.filter(emp->emp.getAge()<26)
		.forEach(emp->System.out.println(emp.getName()+" is of age"+emp.getAge()));
		
		Map<Integer,List<Employee>> map = departments.stream()
				.flatMap(dept->dept.getEmployees().stream())
				.collect(Collectors.groupingBy(emp->emp.getAge()));	
		System.out.println(map);

	}

}

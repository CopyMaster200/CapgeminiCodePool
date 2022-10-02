package com.gs.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ComparableComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Student> als = new ArrayList<>();
		als.add(new Student(3, "Ramesh", 35L));
		als.add(new Student(4, "Naresh", 5L));
		als.add(new Student(1, "Suresh", 75L));
		als.add(new Student(2, "Mahesh", 65L));

		for (Student st : als) {
			System.out.println(st.toString());
		}

		Collections.sort(als);
		System.out.println("\nAfter sorting with id:");
		for (Student st : als) {
			System.out.println(st.toString());
		}

		// MarksCompare
		MarksCompare mc = new MarksCompare();
		Collections.sort(als, mc);
		System.out.println("\nAfter marks sorting with comparator:");
		for (Student st : als) {
			System.out.println(st.toString());
		}

		// NameCompare
		NameCompare nc = new NameCompare();
		Collections.sort(als, nc);
		System.out.println("\nAfter name sorting with comparator:");
		for (Student st : als) {
			System.out.println(st.toString());
		}
	}
}

class Student implements Comparable<Student> {

	private int id;
	private String name;
	private Long marks;

	public Student() {
	}

	public Student(int id, String name, Long marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int compareTo(Student st) {
//		return this.marks.compareTo(st.getMarks());
		return this.id - st.id;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Long getMarks() {
		return this.marks;
	}

	public String toString() {
		return "{" + this.id + "," + this.name + "," + this.marks + "}";
	}
}

class MarksCompare implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
//		return s1.getMarks().compareTo(s2.getMarks());
		if (s1.getMarks() < s2.getMarks())
			return -1;
		else if (s1.getMarks() > s2.getMarks())
			return 1;
		else
			return 0;
	}
}

class NameCompare implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
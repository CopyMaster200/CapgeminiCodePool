package com.gs.prog;

public class GenericsDemo {
	public static void main(String[] args) {

		System.out.println(GenericMethod.addOrConcat(8.0, 9.0));
		System.out.println(GenericMethod.addOrConcat("John", "Wick"));
		
		System.out.println(new GenericClass<Integer>().addOrConcat(5, 9));
		System.out.println(new GenericClass<String>().addOrConcat("Java", "Programming"));
		
		GenericInterface<Integer> giSum = (input1, input2) -> input1 + input2;
		System.out.println(giSum.add(6, 8));
		GenericInterface<String> giConcat = (input1, input2) -> input1 + input2;
		System.out.println(giConcat.add("Spring", "Boot"));
	}

}

interface GenericInterface<T> {// Generic Interface
	Object add(T input1, T input2);
}

class GenericClass<T> {// Generic Class

	public Object addOrConcat(T input1, T input2) {
		if (input1 instanceof Integer) {
			return (Integer) input1 + (Integer) input2;
		}
		if (input1 instanceof String) {
			return (String) input1 + (String) input2;
		}

		return null;
	}
}

class GenericMethod {
	public static <T> Object addOrConcat(T input1, T input2) {// Generic Method
		if (input1 instanceof Double && input2 instanceof Double) {
			return (Double) input1 + (Double) input2;
		}
		else if (input1 instanceof String && input2 instanceof String) {
			return (String) input1 + (String) input2;
		}else {
			throw new IllegalArgumentException("Different arguments were passed.");
		}
	}
}
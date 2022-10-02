package com.gs.prog;

class Singleton {
	private static Singleton single = null;
	public static String str;

	private Singleton() {
		str = "I am single";
	}

	public static Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
}

public class SingletonDemo {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s.str);

		Singleton s1 = Singleton.getInstance();
		System.out.println((s == s1) + " " + s1.hashCode() + " " + s.hashCode());
	}
}
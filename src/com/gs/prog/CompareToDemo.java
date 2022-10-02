package com.gs.prog;

import java.math.BigDecimal;

//Does two object will always be equal, when there compareTo() method returns zero?
public class CompareToDemo {
	//When content is equal it will return 0 and its hashcode also will be same but objects are not equal.
	public static void main(String[] args) {
		String s1 = new String("Capgemini");
		String s2 = new String("Capgemini");
		
		System.out.println("Content comparision: "+s1.equals(s2));
		System.out.println("Object equality check "+s1 == s2);
		System.out.println("CompareTo "+s1.compareTo(s2));
		System.out.println("Hashcode: "+s1.hashCode()+":"+s2.hashCode());
		
		BigDecimal b1 = new BigDecimal(1);
		BigDecimal b2 = new BigDecimal(1);
		
		System.out.println("CompareTo "+b1.compareTo(b2));
		System.out.println("Hashcode: "+b1.hashCode()+":"+b2.hashCode());
		System.out.print("Object equality check: ");
		System.out.println(b1 == b2);
	}
}

package com.gs.patterns;

public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		
		SubWayOrder.Builder builder = new SubWayOrder.Builder();
		builder.bread("Garlic Bread").dressing("Mayonnaise").toppins("Onions").meat("Chicken");
		
		SubWayOrder sb = builder.build();
		System.out.println(sb.getBread());
		System.out.println(sb.getDressing());
		System.out.println(sb.getToppins());
		System.out.println(sb.getMeat());
	}
}

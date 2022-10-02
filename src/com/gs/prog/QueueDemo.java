package com.gs.prog;

import com.gs.datastructures.BasicQueue;

public class QueueDemo {
	public static void main(String[] args) {
		BasicQueue<Integer> qu = new BasicQueue<>();
		qu.enQueue(1);
		qu.enQueue(2);
		qu.enQueue(3);
		qu.enQueue(4);
		
		System.out.println("Size: "+qu.size());
		
		System.out.println(qu.deQueue());
	}
}

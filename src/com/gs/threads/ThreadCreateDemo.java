package com.gs.threads;

import java.util.concurrent.Callable;

public class ThreadCreateDemo {
	public static void main(String[] args) {
		MyChildThread myThread = new MyChildThread();
		myThread.start(); // What will happen if I call a start method ?
//		myThread.run(); // What will happen if I call the method directly ?

		MyChildThread2 t2 = new MyChildThread2();
		Thread t1 = new Thread(t2);
		t1.start();
		
	}
}

class MyChildThread extends Thread {

	public void run() {
		// Statements job
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " got called " + i + " times");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyChildThread2 implements Runnable {

	@Override
	public void run() {
		//Job statements.
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " got called " + i + " times");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class MyChildThread3 implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}

package com.gs.threads;

class Tic implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < 2; i++) {
				System.out.println("tic");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}

class Tac implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < 2; i++) {
				System.out.println("tac");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}

class Toe implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < 2; i++) {
				System.out.println("toe");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}

public class ThreadJoinDemo {
	public static void main(String[] args) {
		try {

			Tic tic = new Tic();
			Tac tac = new Tac();
			Toe toe = new Toe();
			Thread t1 = new Thread(tic);
			Thread t2 = new Thread(tac);
			Thread t3 = new Thread(toe);
			
			t1.start();
			t1.join(); // signals t2 to wait

			if (!t1.isAlive()) {
				t2.start();// if t1 is finished then t2 will start
			}
			t2.join();// signals t3 to wait

			if (!t2.isAlive()) {
				t3.start();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
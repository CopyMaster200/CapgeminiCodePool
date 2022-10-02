package com.gs.prog;

public class RandomNumber {

	public static void main(String[] args) {

		int countZero = 0, countOne = 0, countTwo = 0, countThree = 0, countFour=0, countFive=0;
		int range = 5;
		for (int i = 0; i < 1000; i++) {
			int randno = (int) (Math.random() * ((range) + 1));

			if (randno == 0) {
				countZero++;
			} else if (randno == 1) {
				countOne++;
			} else if (randno == 2) {
				countTwo++;
			} else if (randno == 3) {
				countThree++;
			} else if (randno == 4) {
				countFour++;
			} else if (randno == 5) {
				countFive++;
			}
		}

		System.out.println("Zero: " + countZero);
		System.out.println("One: " + countOne);
		System.out.println("Two: " + countTwo);
		System.out.println("Three: " + countThree);
		System.out.println("Four: " + countFour);
		System.out.println("Five: " + countFive);

	}
}

package com.gs.prog;

public class NumeratorAndDenominator {

	public static void main(String[] args) {
		findTheSolution(2, 5, 1, 5);
		findTheSolution(2, 10, 1, 5);
		findTheSolution(21, 3, 11, 7);
	}

	private static void findTheSolution(int num1, int den1, int num2, int den2) {
		int den, num;
		if (den1 == den2) {
			den = den1;
			num = num1 + num2;
		} else {
			den = den1*den2;
			num = (num1 * den2) + (num2 * den1);
		}
		for(int i=1;i<10;i++) {
			if(num%i == 0 && den % i == 0) {
				num = num / i;
				den = den / i;
			}
		}
		System.out.println(num+"/"+den);
	}

}

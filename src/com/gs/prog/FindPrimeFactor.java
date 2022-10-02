package com.gs.prog;
/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */

/* 
* Problem Statement: Prime fraction of a number
*/

class FindPrimeFactor {
	public static void main(String[] args) {
		findPrimeFactor(60);
	}

	private static void findPrimeFactor(int n) {
		int i = 2;
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n /= 2;
		}

		while (n > 0) {
			if (n == 1)
				break;
			if (n % i == 0) {
				n /= i;
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
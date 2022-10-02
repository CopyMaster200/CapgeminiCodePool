/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */
package com.gs.prog;

/* 
* Problem Statement: 
list = {1,2,4,5,7,8};
k=3
get all pairs from list where difference is k
*/

class PairsWithDifference {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 4, 5, 7, 8 };
		int diff = 3;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] - arr[j] == diff) {// || arr[i]-arr[j] == -3
					System.out.println("{" + arr[i] + "," + arr[j] + "}");
				}
			}
		}
	}
}
package com.gs.prog;

import java.util.ArrayList;
import java.util.Collections;

/*
 * print min, max element for each row , column
  i i i
j 3 4 5
j 8 7 2
j 2 1 9

o/p should be
row min max
1st 3 5
2nd 2 8
3rd 1 9

column min max
1st 2 8
2nd 1 7
3rd 2 9
 * */
public class MinMax2DArray {
	public static void main(String[] args) {
		int[][] arr = { { 3, 4, 5 }, { 8, 7, 2 }, { 2, 1, 9 } };
		System.out.println("Row min max");
		ArrayList<Integer> row = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				row.add(arr[i][j]);
			}
			Collections.sort(row);
			System.out.println(row.get(0) + " " + row.get(arr[i].length-1));
			row.clear();
		}
		
		System.out.println("Col min max");
		ArrayList<Integer> col = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				col.add(arr[j][i]);
			}
			Collections.sort(col);
			System.out.println(col.get(0) + " " + col.get(arr[i].length-1));
			col.clear();
		}
	}
}

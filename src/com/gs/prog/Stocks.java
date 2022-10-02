package com.gs.prog;

public class Stocks {
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 }; // {7,6,4,3,1}
		calcProfit(prices);
	}

	private static void calcProfit(int[] prices) {
		int max_diff=0;
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[j] - prices[i] > max_diff) {
					max_diff = prices[j] - prices[i];
				}
			}
		}
		System.out.println("Max profit: "+max_diff);
	}
}

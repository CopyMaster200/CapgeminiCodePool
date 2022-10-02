package com.gs.inbuilt;

import java.util.Scanner;

public class TryCatchDemo {
	public static void main(String[] args) {
		
		//Arithematic Exception.
		try {
			int i = 1/0;
		}catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("We got arithematic Exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		int retVal = test(1);
		System.out.println(retVal);
		tryResource(new Scanner(System.in));
	}

	private static int test(int x) {
		//Output is 3
		try {
			//Risky or exception code will goes here.
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			//Usually we won't write return statements in finally block.
			return 3;
		}
	}
	
	private static void tryResource(Scanner str){
		//Try with Resource
		try(str){
			System.out.println("Enter: ");
			String st = str.nextLine();
			System.out.println(st);
			//statements
		}catch(Exception e) {
		}
		str.nextLine();
	}
}

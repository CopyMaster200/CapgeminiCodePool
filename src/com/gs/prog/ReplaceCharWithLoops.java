package com.gs.prog;

public class ReplaceCharWithLoops {

	public static void main(String[] args) {
		String str = "abacus";
		String ret = replace(str,'a','z');
		System.out.println(ret);
	}
	
	private static String replace(String str,char c,char replace) {
		String temp = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == c) {
				temp+=replace;
			}else {
				temp+=str.charAt(i);
			}
		}
		return temp;
	}
}

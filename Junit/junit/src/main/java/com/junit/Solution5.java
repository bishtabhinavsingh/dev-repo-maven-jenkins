package com.junit;

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		// main function used to take input from user to the solution function
		System.out.print("Please enter input here:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println(toHex(s));

	}

	public static String toHex(String s) {
		// solution function for stub testing
		StringBuffer ret = new StringBuffer();
		char[] ch = s.toCharArray();
		for (int i =0; i < ch.length; i++) {
			ret.append(Integer.toHexString(ch[i]));
			if (i < ch.length-1) {ret.append(" ");}
		}

		return ret.toString();

	}



}

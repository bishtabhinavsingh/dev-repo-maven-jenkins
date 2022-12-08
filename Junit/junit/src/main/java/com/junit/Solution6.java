package com.junit;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		// main function used to take input from user to the solution function
				// solution function for stub testing
		System.out.print("Please enter input here:");
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		sc.close();
		System.out.println(alternatingCaps(s));

	}

	public static String alternatingCaps(String s) {
		// solution function for stub testing
		StringBuffer sb = new StringBuffer(s);
		for (int i =0; i < s.length(); i++) {
			if (Character.isUpperCase(sb.charAt(0))) {
				if (i%2==0) {
					sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
				}
			} else {
				if (i%2!=0) {
					sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
				}
			}
		}
		return sb.toString();
	}

}

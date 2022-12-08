package com.junit;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		// main function used to take input from user to the solution function
		System.out.print("Please enter input here:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int end = s.length();
		System.out.println(recurser(s, end, ""));
	}
	public static String recurser(String s, int end, String change) {
		// solution function for stub testing
		if (end == 0) { return change; }
		return recurser(s, end-1, change + s.charAt(end-1));
	}
}

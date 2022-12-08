package com.junit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution7 {

	public static void main(String[] args) {
		// main function used to take input from user to the solution function
				// solution function for stub testing
		System.out.print("Please enter input here:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println(removeDups(s));
	}

	public static String removeDups(String s) {
		// solution function for stub testing

		char[] ch = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (char c: ch) {
			set.add(c);
		}
		StringBuilder sb = new StringBuilder();

		for (char c: set) {
			sb.append(c);
		}
		return sb.toString();
	}

}

package com.junit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution9 {
	public static void main(String[] args) {
		// main function used to take input from user to the solution function
		System.out.print("Please enter input here:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		System.out.println(isIsogram(s));
	}

	public static boolean isIsogram(String s) {
		// solution function for stub testing
		Set<Character> set = new HashSet<Character>();
		for (char c: s.toCharArray()) {
			set.add(Character.toLowerCase(c));
		}
		return s.length()==set.size();

	}

}

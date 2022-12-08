package com.junit;

import java.util.Arrays;
import java.util.Scanner;

public class Solution10 {

	public static void main(String[] args) {
		// main function used to take input from user to the solution function
		System.out.print("Please enter input here:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		System.out.println(sorter(s));
	}

	public static String sorter(String s) {
		// solution function for stub testing
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String str = "";
		for (char c: ch) {
			str += c;
		}
		return str;
	}

}

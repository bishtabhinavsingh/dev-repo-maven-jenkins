package com.junit;

import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		// main function used to take input from user to the solution function
		System.out.print("Please enter input:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		System.out.println(fibo(i));
	}

	public static int fibo(int i) {
		// solution function for stub testing
		if (i == 0 ) return 0;
		if (i == 1 || i == 2) return 1;
		return fibo(i-1) + fibo(i-2);
	}

}

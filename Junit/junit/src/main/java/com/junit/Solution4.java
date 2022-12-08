package com.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution4 {

	public static void main(String[] args) {
		// main function used to take input from user to the solution function
		System.out.print("Please enter input here:");
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		sc.close();
		System.out.println(validator(email));
	}

	public static boolean validator(String email) {
		// solution function for stub testing
		Pattern p = Pattern.compile("^(.+)@(.+)$");
	    Matcher m = p.matcher(email);
		return m.matches();
	}

}

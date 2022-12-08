package com.junit;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// main function used to take input from user to the solution function
		System.out.print("Please enter input here:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[][] matrix = solution(n);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("[");
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println("]");
		}
	}


	public static int[][] solution(int n) {
		// solution function for stub testing
		if (n == 0) {System.out.println("0");}
		if (n == 1) {System.out.println("[1]");}
		int[] arr = new int[n];
		Arrays.fill(arr, n);
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			matrix[i] = arr;
		}
		return matrix;

}
}

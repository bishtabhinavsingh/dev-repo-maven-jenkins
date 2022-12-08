package com.junit;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		// main function used to take input from user to the solution function
		System.out.println("Enter the numbers in array with comma (,) seperation");
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.next().split(",");
		sc.close();
		int n = nums.length;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(nums[i]);
		}
		int ans = recurser(arr, 0, 0);
		System.out.println(ans);
	}
	public static int recurser(int[] arr, int i, int sum) {
		// solution function for stub testing
		if (i == arr.length) return sum;
		sum += arr[i];
		return recurser(arr, i+1, sum);
	}
}

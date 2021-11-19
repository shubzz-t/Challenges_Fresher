package com.basic.programs;

public class Odd_Occurance2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4 };
		int n = arr.length;

		System.out.println(oddOccuranceIs(arr, n));
	}

	private static int oddOccuranceIs(int[] arr, int n) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		return res;
	}

}

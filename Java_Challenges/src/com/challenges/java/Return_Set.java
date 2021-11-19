package com.challenges.java;

public class Return_Set {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = { 3, 4, 5, 11, 23, 42, 12, 6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}

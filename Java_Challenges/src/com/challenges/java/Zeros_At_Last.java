package com.challenges.java;

public class Zeros_At_Last {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0,0, 4, 0, 0, 5, 6, 0 };
		int i = 0, j = arr.length - 1;

		while (i <= j) {
			while (arr[i] != 0) {
				i++;
			}
			while (arr[j] == 0) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
				j--;
			}
		}

		for (int g : arr) {
			System.out.println(g + " ");
		}
	}
}

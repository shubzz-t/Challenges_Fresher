package com.fresher.programs;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5 };

		int length = arr.length - 1;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[length];
					length--;

				}
			}

		}
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}

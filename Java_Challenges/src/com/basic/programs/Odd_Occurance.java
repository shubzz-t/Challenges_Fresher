package com.basic.programs;

public class Odd_Occurance {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4 };

		int n = arr.length;

		System.out.println(OddOccuranceIs(arr, n));
	}

	private static int OddOccuranceIs(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return arr[i];
			}
		}
		return -1;
	}

}

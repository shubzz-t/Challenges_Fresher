package com.challenges.java;

import java.util.Iterator;

public class Largest {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 5, 2, 6, 8, 4, 9, 5, 3, 6,454, 11, 4, 5, 32, 53, 33, 5, 34, 343 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println(max);
	}

}

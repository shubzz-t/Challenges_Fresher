package com.fresher.programs;

import java.util.Scanner;

public class Insertion_Sort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NO OF :- ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("ENTER THE " + n + " NUMBERS :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		insertionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

		scanner.close();
	}

	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}
}

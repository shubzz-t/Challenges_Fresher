package com.fresher.programs;

import java.util.Scanner;

public class Quicksort1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NO LENGTH :- ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("ENTER THE " + n + " NUMBERS :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		partition(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	private static void partition(int[] arr, int low, int high) {

		if (low < high) {
			int pivot = quicksort(arr, low, high);
			partition(arr, low, pivot - 1);
			partition(arr, pivot + 1, high);
		}

	}

	private static int quicksort(int[] arr, int low, int high) {
		int i = low + 1;
		int pivot = arr[low];

		for (int j = low + 1; j <= high; j++) {
			if (arr[j] < pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}

		}
		int temp = arr[i - 1];
		arr[i - 1] = arr[low];
		arr[low] = temp;
		return i - 1;
	}

}

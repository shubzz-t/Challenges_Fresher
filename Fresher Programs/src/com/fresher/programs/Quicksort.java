package com.fresher.programs;

import java.util.Scanner;

class quicksort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NO OF :- ");
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
		scanner.close();
	}

	private static void partition(int[] arr, int low, int high) {
		int pivot = Quicksort(arr, low, high);
		if (low < pivot - 1) {
			partition(arr, low, pivot - 1);
		}
		if (high > pivot) {
			partition(arr, pivot, high);
		}

	}

	private static int Quicksort(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];

		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}

			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

}

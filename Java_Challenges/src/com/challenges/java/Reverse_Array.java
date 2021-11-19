package com.challenges.java;


public class Reverse_Array {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 6, 23, 56, 3, 6, 8, 9, 4, 12 };
		int first = 0, last =arr.length-1;

		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

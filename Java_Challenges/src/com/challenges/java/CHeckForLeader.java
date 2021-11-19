package com.challenges.java;

public class CHeckForLeader {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 5, 6, 9, 7, 6, 8, 4 };

		for (int i = 0; i < arr.length-1; i++) {
			int count = 0;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(arr[i] + " ");
			}
		}
	}

}

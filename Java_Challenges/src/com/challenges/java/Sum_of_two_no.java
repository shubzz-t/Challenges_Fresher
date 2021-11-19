package com.challenges.java;

import java.util.Scanner;

public class Sum_of_two_no {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE SIZE :- ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("ENTER THE " + n + " ELEMENTS OF ARRAY :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((arr[i]+arr[j])==10 && i != j) {
					System.out.println(arr[i] + " , " + arr[j]);
				}
			}
		}
		
		scanner.close();
	}

}

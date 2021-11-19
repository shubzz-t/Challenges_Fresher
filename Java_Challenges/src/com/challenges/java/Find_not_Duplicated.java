package com.challenges.java;

import java.util.Scanner;

public class Find_not_Duplicated {

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
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("UNIQUE ELEMENT :- " + arr[i]);
			}
		}

	}

}

package com.challenges.java;

import java.util.Scanner;

public class Duplicate_Element {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE SIZE :- ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("ENTER THE " + n + " ELEMENTS OF ARRAY :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("ENTER THE NO TO CHECK DUPLICATE :- ");
		int g = scanner.nextInt();
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (g==arr[i]) {
				count++;
				if (count>=2) {
					System.out.println("THERE IS DUPLICATE ");
					break;
				}
				else {
					System.out.println("NO DUPLICATE");
				}
			}
		}
scanner.close();
	}

}

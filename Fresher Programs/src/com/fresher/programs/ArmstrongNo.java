package com.fresher.programs;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NO :- ");
		int n = scanner.nextInt();
		int temp = n;
		int r = 0, sum = 0;
		while (n != 0) {
			r = n % 10;
			sum = (r * r * r) + sum;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("IS ARMSTRONG");
		} else {
			System.out.println("NOT ARMSTRONG");
		}
		scanner.close();
	}

}

package com.challenges.java;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		System.out.println("Enter THE X :  ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		if (x % 2 == 0) {

			if (x >= 0 && x <= 10) {
				System.out.println("ITS 0 - 10");
			} else if (x > 10 && x < 20) {
				System.out.println("ITS 11 TO 19 ");
			}

			else if (x >= 20) {
				System.out.println("ITS GREATER THAN 20");
			}
		} else {
			System.out.println("ODD");
		}
		scan.close();
	}

}

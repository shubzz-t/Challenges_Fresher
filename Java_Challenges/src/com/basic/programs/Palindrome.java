package com.basic.programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("ENTER THE NO :- ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int temp=0 , r , sum=0;
		temp = n ;

		while (n > 0) {
		 r = n % 10;
		 sum = (sum*10)+r;
			n = n /10;
		}
		if (sum==temp) {
			System.out.println("IS PALINDROME...");
		}
		else {
			System.out.println("NOT PALNIDROME");
		}
scanner.close();
	}

}

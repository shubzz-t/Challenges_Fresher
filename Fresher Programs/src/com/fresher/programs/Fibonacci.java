package com.fresher.programs;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;
		int x1 = 0;
		int x2 = 1;
		int x3 = 0;
		System.out.print(x1 + " " + x2 + " ");

		for (int i = 1; i <= n; i++) {
			x3 = x1 + x2;
			System.out.print(x3 + " ");
			x1 = x2;
			x2 = x3;

		}
	}

}

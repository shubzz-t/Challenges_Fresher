package com.fresher.programs;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;

//		int fact = 1;
//		if (n == 0) {
//			System.out.println(0);
//		} else {
//			for (int i = 1; i <= n; i++) {
//				fact = fact * i;
//			}
//			System.out.println(fact);
//		}

		// RECURSIVE
System.out.println("Factorial is :- " + factorialOF(n));
		
	}

	private static int factorialOF(int n) {
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		
		return n * factorialOF(n-1);
	}

}

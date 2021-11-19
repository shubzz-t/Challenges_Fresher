package com.basic.programs;

public class CheckPrime {

	public static void main(String[] args) {
		int n=2;
		
		System.out.println("IS IT PRIME :- " + isPrime(n));

	}

	private static boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
		if (n==2) {
			return true;
		}
		if (n%2==0) {
			return false;
		}
		for (int i = 3; i < Math.sqrt(n); i+=2) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

}

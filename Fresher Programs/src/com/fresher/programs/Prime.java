package com.fresher.programs;

public class Prime {

	public static void main(String[] args) {
		int n = 5;

		int flag = 0;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flag = 1;
			}
		}
		if (flag==0) {
			System.out.println("PRIME");
		}
		else {
			System.out.println("NOT PRIME");
		}

	}

}

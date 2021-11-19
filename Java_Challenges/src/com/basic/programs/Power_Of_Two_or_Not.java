package com.basic.programs;

public class Power_Of_Two_or_Not {
	public static void main(String[] args) {
		int n = 32;

		if (isPower(n)) {
			System.out.println("YES IT IS POWER OF 2");
		} else {
			System.out.println("IT IS NOT POWER OF 2");
		}
	}

	private static boolean isPower(int n) {
		if (n == 0) {
			return false;
		}
		while (n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}
}

package com.basic.programs.countSetBits;

public class RecursiveApproach {

	public static void main(String[] args) {
		int n = 9;

		System.out.println("COUNT OF BITS IS :- " + countBits(n));

	}

	private static int countBits(int n) {
		if (n == 0) {
			return 0;
		}
		return (n & 1) + countBits(n >>= 1);
	}

}

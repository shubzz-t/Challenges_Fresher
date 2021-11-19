package com.basic.programs.countSetBits;

public class SimpleMethod {

	public static void main(String[] args) {
		int n = 9;

		System.out.println("NO OF BITS PRESENT IS :- " + countbits(n));
	}

	private static int countbits(int n) {
		int count = 0;
		while (n > 0) {
          count += n & 1;
          n >>= 1;
		}
		return count;
	}

}

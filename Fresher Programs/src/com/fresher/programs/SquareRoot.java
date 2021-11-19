package com.fresher.programs;

public class SquareRoot {

	public static void main(String[] args) {
		int x = 16;

		System.out.println("SQRRTT OF :- " + getSqrt(x));

	}

	public static int getSqrt(int x) {
		if (x == 0 || x == 1) {
			return x;
		}

		int i = 1, result = 1;
		while (result <= x) {
			i++;
			result = i * i;
		}
		return i - 1;

	}

}

package com.basic.programs;

public class Count_no_of_digits {

	public static void main(String[] args) {
		int n = 4435;

		System.out.println("THE COUNT IS :- " + count(n));
		System.out.println("The count is :- " + count1(n));
		System.out.println("THE COUNT IS :- " + count2(n));

	}

	private static int count2(int n) {
		if (n / 10 == 0)
			return 1;

		return 1 + count2(n / 10);
	}

	private static int count1(int n) {
		int count = 0;

		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	private static int count(int n) {
		String num = Integer.toString(n);

		return num.length();
	}

}

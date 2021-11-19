package com.challenges.java;

public class String_Palindrome {
	public static void main(String[] args) {
		String string = "MADAM";
		char[] cha = string.toCharArray();

		int count = 0;
		for (int i = 0, j = cha.length - 1; i < cha.length && j > 0; i++, j--) {
			if (cha[i] != cha[j]) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("IT IS PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}

	}
}

package com.fresher.programs;

public class String_Palindrome {

	public static void main(String[] args) {
		String string = "roor";
		char[] str = string.toCharArray();
		int count = 0;
		for (int i = 0, j = str.length - 1; i < str.length - 1 && j > 0; i++, j--) {
			if (str[i] != str[j]) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("Not PALINDROME");
		}

	}

}

package com.fresher.programs;

import java.util.Arrays;

public class Anagram_Two_Strings {

	public static void main(String[] args) {
		String str1 = "SILENT";
		String str2 = "LISTEN";

		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		int count = 0;

		Arrays.sort(char1);
		Arrays.sort(char2);

		if (char1.length != char2.length) {
			System.out.println("NOT ANAGRAM");
		} else {
			for (int i = 0; i < char1.length; i++) {
				if (char1[i] != char2[i]) {
					count++;
				}
			}

			if (count == 0) {
				System.out.println("ANAGRAM");
			} else {
				System.out.println("NOT ANAGRAM");
			}
		}
	}

}

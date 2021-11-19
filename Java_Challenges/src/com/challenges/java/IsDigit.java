package com.challenges.java;

public class IsDigit {

	public static void main(String[] args) {
		String string = "hey 1 its the string 12";
		char[] chars = string.toCharArray();
		
		for (char c : chars) {
			if (Character.isDigit(c)) {
				System.out.println(c + " ");
			}else {
				System.out.println("String :- " + c);
			}
		}

	}

}

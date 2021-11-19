package com.fresher.programs;

public class ReverseString {

	public static void main(String[] args) {
		String string = "HEY ITS THE STRING";
		char[] str = string.toCharArray();
		
		for (int i = str.length-1 ; i >=0 ; i--) {
			System.out.print(str[i]);
		}

	}

}

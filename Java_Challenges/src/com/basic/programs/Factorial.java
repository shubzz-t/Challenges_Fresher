package com.basic.programs;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("FACTORIAL IS :- " + fact(n));

	}

	private static int fact(int n) {
		if (n==0) {
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		return n*(fact(n-1));
	}

}

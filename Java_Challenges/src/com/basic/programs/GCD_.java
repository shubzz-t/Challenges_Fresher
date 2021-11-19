package com.basic.programs;

public class GCD_ {

	public static void main(String[] args)
	{
		int a=4;
		int b=8;
		
		System.out.println("THE GCD OF 2 NOS IS :- " + gcd(a,b));
	}

//	private static int gcd(int a, int b) {
//		if (a==0) {
//			return b;
//		}
//		if (b==0) {
//			return a;
//		}
//		if (a==b) {
//			return a;
//		}
//		
//		if (a>b) {
//			return gcd(a-b, b);
//		}
//		return gcd(a, b-a);
//	}
	
	private static int gcd(int a, int b) {
	   if (b==0) {
		return a;
	}		
	   return gcd(b, a%b);
	}
}

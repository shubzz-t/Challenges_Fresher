package com.basic.programs;


public class LCM_ {
	public static void main(String[] args) {
int a=20 , b=30;
System.out.println("LCM OF " + a + " AND " + b  +" IS :- " +  lcm(a,b));
	}

	private static int lcm(int a, int b) {
		
		return (a/gcd(a, b))*b;
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}

package com.basic.programs;

public class Power {

	public static void main(String[] args) {
		int x=2 , n=3;
		
		System.out.println("POWER OF " + x + " RAISED TO  " + n + " IS :- " + power(x,n));

	}
	
	static int power(int x, int n)
	{
		if (n==0) {
			return 1;
		}
		if (n==1) {
			return x;
		}
		int temp = power(x, n/2);
		if (n%2==0) {
			return temp*temp;
		}
		else {
			return x*temp*temp;
		}
		
	}

}

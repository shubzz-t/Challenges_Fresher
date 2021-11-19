package com.basic.programs;

import java.util.Arrays;


public class SeiveOfEratosthenes {

	public static void main(String[] args) {
		int n=30;
		
		SeiveOfEratosthenes s = new SeiveOfEratosthenes();
		s.sOE(n);
		

	}

	private void sOE(int n) {
		
		boolean[] prime = new boolean[n+1];
		Arrays.fill(prime, true);
		
		for (int i = 2  ; i*i <= n ; i++) {
			if (prime[i]==true) {
				for (int j = i*i ; j <= n  ; j+=i) {
					prime[j]=false;
				}
			}
		}
		
		for (int i = 0; i < prime.length-1; i++) {
			if (prime[i]==true) {
				System.out.print(i + " ");
			}
		}
		
	}

}

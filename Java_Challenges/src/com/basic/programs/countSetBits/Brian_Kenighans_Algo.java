package com.basic.programs.countSetBits;

public class Brian_Kenighans_Algo {

	public static void main(String[] args) {
		int n=9;
		
		System.out.println("NO OF BITS IS :- " + countBits(n));

	}

	private static int countBits(int n) {
		int count=0;
		
		while (n>0) {
			n &= (n-1);
			count++;
			
		}
		
		return count;
		
	}

}

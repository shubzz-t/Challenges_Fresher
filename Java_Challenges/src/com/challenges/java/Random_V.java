package com.challenges.java;

import java.util.Random;

public class Random_V {

	// PRINTING RANDOM NUMBERS FROM 100-200
	public static void main(String[] args) {
//
//		int n;
//		Random random = new Random();
//		int count = 0;
//
//		while (count < 20) {
//			n = random.nextInt(200);
//			if (n > 99) {
//				count++;
//				System.out.println(n);
//			}
//		}
		
		
		
		
//		//2ND APPROACH
//		Random r = new Random();
//		for (int i = 0; i < 10; i++) {
//			System.out.println(r.nextInt(100)+100);
//		}
		
		
		//3rd Approach
		int n;
		int  count=0;
		Random random = new Random();
		while (true) {
			n = random.nextInt(200);
			if (n>100) {
				count++;
				System.out.println(n);
			}
			if (count>20) {
				break;
			}
		}
	}
}

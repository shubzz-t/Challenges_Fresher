package com.basic.programs;

class Kth_Bit_Set_OR_Not {

	public static void main(String[] args) {
		int n = 7;
		int k = 2;

		//BITWISE LEFT SHIFT
//		if ((n & (1 << (k - 1))) != 0) {
//
//			System.out.println("SET");
//		} else {
//			System.out.println("NOT SET");
//		}
		
		//RIGHT SHIFT
		if((n>>(k-1) & 1)==1)
		{
			System.out.println("SET");
		}
		else {
			System.out.println("NOT SET");
		}
	}

}

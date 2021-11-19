package com.challenges.java;

public class Default_Values {

	static int i;
	static char c;
	static float f;
	static String string;
	static long l;
	static byte b;
	
	
	private static void disp()
	{
		System.out.println("STATIC VALUE OF INT :- " + i);
		System.out.println("STATIC VALUE OF CHAR :- " + c);
		System.out.println("STATIC VALUE OF FLOAT :- " + f);
		System.out.println("STATIC VALUE OF STRING :- " + string);
		System.out.println("STATIC VALUE OF long :- " + l);
		System.out.println("STATIC VALUE OF BYTE :- " + b);
	}
	
	public static void main(String[] args) {
		Default_Values.disp();

	}

}

package com.challenges.java;


public class Blocks {

	{
		int i=20;
		System.out.println("INSTANCE BLOCK I :- " + i);
	}
	
	
	static
	{
		int s=30 ;
		System.out.println("THIS IS THE STATIC BLOCK EXECUTION.........." + s);
	}
	
	public static void main(String[] args) {
		Blocks b = new Blocks();
		Blocks b1 = new Blocks();

	}

}

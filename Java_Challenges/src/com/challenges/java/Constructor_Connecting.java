package com.challenges.java;

public class Constructor_Connecting {

	Constructor_Connecting()
	{
		System.out.println("hey 1");
	}
	
	Constructor_Connecting(int x)
	{
		this();
		System.out.println("heyyyyyy 2");
		System.out.println(x);
	}
	
	Constructor_Connecting(int x ,int y)
	{
		this(x);
		System.out.println("heyyyyyy 3");
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
	
Constructor_Connecting c = new Constructor_Connecting(3 , 4);

	}

}

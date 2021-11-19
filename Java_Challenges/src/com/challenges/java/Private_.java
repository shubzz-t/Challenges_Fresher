package com.challenges.java;

public class Private_ {

	private int x;
	
	private Private_() {
	    x = 40;
	    System.out.println(x);
	}
	
	private void method()
	{
		System.out.println("PRIVATE METHOD");
	}
	
	

	public static void main(String[] args)
	{
	Private_ p = new Private_();
	p.method();
	}
}


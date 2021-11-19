package com.challenges.java;

class Super{
	public Super(int x) {
	 System.out.println("super class" + x);
		System.out.println("Super class  constructor");   
	}
}

class Child_ extends Super{
	public Child_(int x , int y) {
	 super(x);
	 System.out.println("CHILD CLASS " + y );
	}

	public static void main(String[] args) {
		Child_ c = new Child_(20,30);
		

	}

}

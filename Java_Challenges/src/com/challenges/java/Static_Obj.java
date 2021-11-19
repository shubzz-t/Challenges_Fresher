package com.challenges.java;

public class Static_Obj {
	static Static_Obj o;
	static {
		o = new Static_Obj();
		o.fun();
	}

	private void fun() {
		System.out.println("ITS FUN");

	}

	public static void main(String[] args) {
		o.fun();
	}

}

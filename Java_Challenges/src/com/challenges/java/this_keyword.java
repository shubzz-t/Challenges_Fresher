package com.challenges.java;


public class this_keyword {

	public static void main(String[] args) {
		this_keyword t = new this_keyword();
		t.access();

	}

	private void access() {
		this.nonStat();
		this.stat();	
	}
	
	void nonStat()
	{
		System.out.println("NON-STATIC METHOD");
	}
	static void stat()
	{
		System.out.println("STATIC METHOD");
	}

}

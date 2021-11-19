package com.challenges.java;

public class String_to_Int {

	public static void main(String[] args) {
		String a = "10";
		String b = "20";
		String c = "Java"; 
		
		Integer i = Integer.parseInt(a);
		Integer j = Integer.parseInt(b);
		
		System.out.println("ADDITION " + (i+j));

		try {
			Integer k = Integer.parseInt(c);
			System.out.println("VALUE OF K :" + k);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}

package com.challenges.java;


public class Equal_Arrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 , 8  };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
				}
			}
		}
		if (count==arr1.length) {
			System.out.println("HAVING SAME ELEMETS");
		}
		else {
			System.out.println("ARRAYS NOT HAVING SAME ELEMENT.");
		}
		
	}

}

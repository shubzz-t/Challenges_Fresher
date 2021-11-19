package com.challenges.java;

public class ForEach2 {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50};
		int arr2[] = {50 , 30 , 60 , 20 , 70};
		
		
		for (int i : arr1) {
			for (int j : arr2) {
				if (i==j) {
					System.out.println(i + " : " + j);
				}
			}
		}
	}

}

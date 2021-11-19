package com.challenges.java;

public class Removing_Duplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,4,3,5,6,3,6,4,7,5};
		int k=arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					int temp = arr[j];
					arr[j] = arr[k-1];
					arr[k-1] = temp;
					k--;
				}
			}
		}
for (int i = 0; i <= k; i++) {
	System.out.println(arr[i]);
}
	}

}

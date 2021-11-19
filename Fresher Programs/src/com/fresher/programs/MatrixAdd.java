package com.fresher.programs;

public class MatrixAdd {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] arr2 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] arr3 = new int[10][10];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}

package com.basic.programs;

import java.util.HashMap;


public class Odd_Occurance1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4 };
		int n = arr.length;

		System.out.println(OddOccuranceIs(arr, n));
	}

	private static int OddOccuranceIs(int[] arr, int n) {
		HashMap<Integer, Integer> hMap = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (hMap.containsKey(arr[i])) {
				int val = hMap.get(arr[i]);
				hMap.put(arr[i], val + 1);
			} else {
				hMap.put(arr[i], 1);
			}
		}

		for (int i : hMap.keySet()) {
			if (hMap.get(i) % 2 != 0) {
				return i;
			}
		}
		return -1;
	}

}

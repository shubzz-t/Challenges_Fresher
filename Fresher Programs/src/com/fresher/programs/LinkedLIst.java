package com.fresher.programs;

import java.util.LinkedList;


public class LinkedLIst {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);

		length(list);

	}

	private static void length(LinkedList<Integer> list) {
		int count = 0;

		for (Integer integer : list) {
			count++;
		}
		System.out.println(count);

	}

}

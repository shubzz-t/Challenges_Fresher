package com.challenges.java;

import java.util.ArrayList;


public class ArrayList_Remove {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(2);
		
		Integer i = 2;
		list.remove(list.size()-1);
		list.remove(i);
		System.out.print(list);

	}

}

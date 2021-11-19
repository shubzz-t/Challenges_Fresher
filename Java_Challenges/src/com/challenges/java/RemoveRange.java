package com.challenges.java;

import java.util.ArrayList;



public class RemoveRange extends ArrayList<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	public void removeRange(int fromInd , int toInd)
//	{
//		super.removeRange(fromInd, toInd);
//	}

	public static void main(String[] args) {
	
		RemoveRange arr = new RemoveRange();
		for (int i = 0; i <= 100; i+=10) {
			arr.add(i);
		}
		arr.removeRange(3, 7);
		System.out.println(arr);

	}

}

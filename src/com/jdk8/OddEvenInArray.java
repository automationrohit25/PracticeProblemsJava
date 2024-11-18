package com.jdk8;

import java.util.LinkedHashSet;

public class OddEvenInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 2, 3, 3, 4, 6, 13, 15, 17, 13, 14, 16, 16, 23, 21, 19 };

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		int count = set.size();
		System.out.println(count);
		
		int[] arr1 = new int[25];
		arr1 =  set.toArray();
	

		

	}

}

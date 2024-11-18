package com.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,2,1,4,5,6,4,5,6,7,8,9));
		
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>(numbers);
		ArrayList<Integer> numberListWithoutduplicates = new ArrayList<>(linkedhashset);
		
		System.out.println(numberListWithoutduplicates);
		
		ArrayList<Integer> marklist = new ArrayList<>(Arrays.asList(1,2,3,2,1,4,5,6,4,5,6,7,8,9));
		List<Integer> marklist.stream().distinct().collect(Collectors.toList());
		

	}

}

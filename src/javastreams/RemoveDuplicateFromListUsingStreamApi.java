package javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromListUsingStreamApi {

	public static void main(String[] args) {
		
		List<String> listWithStringValues = Arrays.asList("Java","Selenium","Python","Selenium");
		
		List<String> listWithoutDuplicate = listWithStringValues
				.stream()
				.distinct().collect(Collectors.toList());
		
		System.out.println("Before Removing Duplicate: " + listWithStringValues);
		System.out.println("After Removing Duplicate: " + listWithoutDuplicate);
		

	}

}

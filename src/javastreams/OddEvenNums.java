package javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNums {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,7,8);
		
		List<Integer> evenList = numbers.stream()
											.filter(e -> e%2==0)
												.collect(Collectors.toList());
		
		System.out.println(evenList);

	}

}

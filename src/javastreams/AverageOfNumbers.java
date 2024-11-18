package javastreams;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,7);
		
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		
		System.out.println(avg);

	}

}

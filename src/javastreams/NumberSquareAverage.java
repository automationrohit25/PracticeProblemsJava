package javastreams;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,3,5,6);
		double avg = list.stream()
				.map(e -> e*e)
						.filter(e -> e>20)
							.mapToInt(e -> e).average().getAsDouble();
		
		System.out.println(avg);

	}

}

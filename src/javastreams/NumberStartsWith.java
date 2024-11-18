package javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,22,222,232,24);
		
		List<Integer> l = list.stream()
					.map(e -> String.valueOf(e))
						.filter(e -> e.startsWith("2"))
							.map(Integer::valueOf)
								.collect(Collectors.toList());
		

	}

}

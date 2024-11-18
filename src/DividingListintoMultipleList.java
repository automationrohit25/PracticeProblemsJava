import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class DividingListintoMultipleList {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		int chunk = 3;
		
		AtomicInteger counter = new AtomicInteger();
		
			Collection<List<Integer>> l = list.stream().collect(Collectors.groupingBy(it-> counter.getAndIncrement()/chunk)).values();
			System.out.println(l);

		}

}

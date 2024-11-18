import java.util.HashMap;
import java.util.Map;


public class ComparingStringArrays {

	static boolean areEqual(String[] arr1, String[] arr2) {

		int m = arr1.length;
		int n = arr2.length;

		if (m != n)
			return false;

		Map<String, Integer> map = new HashMap<>();
		int count = 0;

		for (int i = 0; i < m; i++) {
			if (map.get(arr1[i]) == null) {
				map.put(arr1[i], 1);
			} else {
				count = map.get(arr1[i]);
				count++;
				map.put(arr1[i], count);
			}
		}
		
		for(int i = 0; i < m; i++) {
			if(!map.containsKey(arr2[i]))
				return false;
			if(map.get(arr2[i]) == 0)
				return false;
			count = map.get(arr2[i]);
			count--;
			map.put(arr2[i], count);
		}
		return true;
	}

	public static void main(String[] args) {

		String[] s1 = { "A", "B", "C", "D", "E" };
		String[] s2 = { "C", "D", "E", "A", "F" };
		
		if(areEqual(s1, s2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}

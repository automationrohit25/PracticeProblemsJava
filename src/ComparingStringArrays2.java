import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ComparingStringArrays2 {

	static boolean areEqual(String[] arr1, String[] arr2) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {

		String[] s1 = { "A", "B", "C", "D", "E" };
		String[] s2 = { "C", "D", "E", "A", "B" };
		
		if(areEqual(s1, s2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}

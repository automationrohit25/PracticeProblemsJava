
public class FirstNonRepeatingInteger {
	
	static int firstNonRepeating(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			int j;
			for(j = i+1; j < arr.length; j++) 
				if(i != j && arr[i] == arr[j]) 
					break;
				if(j == arr.length)
					return arr[i];
			}
			return -1;	
	}

	public static void main(String[] args) {
		
		int[] arr = {-1, 2, -1, 3, 0};
		System.out.println(firstNonRepeating(arr));
	

	}

}

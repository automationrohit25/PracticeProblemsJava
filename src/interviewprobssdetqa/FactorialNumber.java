package interviewprobssdetqa;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
		 int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        int groupSize = 3;

	        // Process the array in groups
	        for (int i = 0; i < arr.length; i = i+ groupSize) {
	            int start = i;
	            int end = Math.min(i + groupSize - 1, arr.length - 1);

	            // Reverse the current group
	            while (start < end) {
	                int temp = arr[start];
	                arr[start] = arr[end];
	                arr[end] = temp;
	                start++;
	                end--;
	            }
	        }

	        // Print the result
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	}

}


public class reverseString {
	
	public static void main(String[] args) {
		
		String str = "test12java34pyt";
		
		String[] words = str.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(reverseString(word));
        }

        System.out.println(sb.toString());
		
	}

	private static String reverseString(String s) {
		
	    char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        if(!Character.isDigit(arr[left])) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        }
        return new String(arr);
    }
	

}

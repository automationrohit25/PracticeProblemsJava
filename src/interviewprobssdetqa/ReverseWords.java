package interviewprobssdetqa;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		String str = "Welcome To Java";
		
		String[] words = str.split(" ");
		
		String reverseString = "";
		
		for(int i = 0; i < words.length; i++) {
			
			String reverseword = "";
			
			for(int j = words[i].length() -1; j >=0; j--) {
				
				reverseword = reverseword + words[i].charAt(j);
			}
			
			reverseString = reverseString + reverseword + " ";
			
		}
		
		System.out.println(reverseString);
	}

}

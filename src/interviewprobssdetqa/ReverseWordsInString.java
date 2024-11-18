package interviewprobssdetqa;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String s = "India is a, beautiful country";
		
	    String[] words = s.split(" ");
	    String reverseString = "";
	    
	    for(int i = words.length-1; i >= 0; i--) {
	    	
	    	reverseString = reverseString + words[i] + " ";
	    }
	    
	    System.out.println(reverseString);

	}

}

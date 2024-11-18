package interviewprobssdetqa;

import java.util.ArrayList;
import java.util.List;

public class NumberStartsWithOne {
	
	public static String replaceCharacterWithHash(String input, char charToReplace) {
		 StringBuilder result = new StringBuilder();
	        int occurrence = 0;

	        // Iterate through the input string
	        for (char ch : input.toCharArray()) {
	            if (ch == charToReplace) {
	                occurrence++; // Increment occurrence of 'o'
	                // If it's the first occurrence, keep the character, else replace with '#'
	                if (occurrence > 1) {
	                    result.append('#');
	                } else {
	                    result.append(ch); // Keep the first 'o'
	                }
	            } else {
	                result.append(ch); // Add non-target characters as is
	            }
	        }

	        return result.toString();
    }

	
	
	public static void main(String[] args) {
		
		
		String input1 = "tomorrow";
        String input2 = "zolo";

        // Process and print results
        System.out.println("Input: " + input1);
        System.out.println("Output: " + replaceCharacterWithHash(input1, 'o'));

        System.out.println("Input: " + input2);
        System.out.println("Output: " + replaceCharacterWithHash(input2, 'o'));

	}

}

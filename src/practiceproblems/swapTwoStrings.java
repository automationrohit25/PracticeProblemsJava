package practiceproblems;

public class swapTwoStrings {

	public static void main(String[] args) {
		
		String s1 = "india";
		String s2 = "country";
		
	    s1 = s1 + s2;
	    s2 = s1.substring(0, s1.length() - s2.length());
	    s1 = s1.substring(s2.length());
		
	    System.out.println("After swapping " + s1);
	    System.out.println("After swapping " + s2);
 
	}

}

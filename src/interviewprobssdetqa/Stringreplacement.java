package interviewprobssdetqa;

public class Stringreplacement {	

	public static void main(String[] args) {
	
		String s = "a2b3c1"; //aabbbc
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
			
				System.out.print(s.charAt(i));
			
			} else {
				int num = Character.getNumericValue(s.charAt(i));
				for(int j = 1; j < num; j++) {
					System.out.print(s.charAt(i-1));
				}
			}
		}
		

	}

}

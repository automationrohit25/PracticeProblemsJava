package interviewprobssdetqa;

public class Stringreplacement2 {	

	public static void main(String[] args) {
	
		String s = "tommorow"; //aabbbc
		int num = 3;
		
		int n = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'o') {
				n++;
			}
		}
		System.out.println(n);
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != 'o') {
			
				System.out.print(s.charAt(i));
			
			} else {
				for(int j = 0; j < num; j++) {
					System.out.print("$");
				}
				num--;
			}
			
		}
		

	}

}

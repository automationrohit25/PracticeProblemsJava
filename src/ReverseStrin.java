
public class ReverseStrin {

	public static void main(String[] args) {

		String str = "This is Apple, Apple is an good organization";

		String words[] = str.split(" ");

		String str2 = "";
		

		for (int i = 0; i < words.length; i++) {

			String reverseword = "";
			
			for (int j = words[i].length() - 1; j >= 0; j--) {
				
				if(words[i].charAt(j) != ',') {

				reverseword =  reverseword + words[i].charAt(j);
				
				} 
				
			}
			
			str2 = str2 + reverseword + " ";
		}

//		System.out.println(str2);
		
//		String s = str2.replaceFirst("elppA", "elppA,");
//		
//		System.out.println(s);
		String finalword = "";
		
		String words1[] = str2.split(" ");
		
		boolean flag = true;
		
		for(int i =0; i < words1.length; i++) {
			
			
			if(words1[i].equals("elppA") && flag == true) {
				String w = words1[i].replace("elppA", "elppA,");
				words1[i] = w;
				flag = false;
			}
			
			finalword = finalword + words1[i] + " ";
		}
		System.out.println(finalword);
	}
	
}

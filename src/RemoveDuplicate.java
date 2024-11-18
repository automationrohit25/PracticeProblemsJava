import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String str = "This is Apple  Apple is an good organization";
		
		String  words[] = str.split(" ");
		
		String str2 = "";
		
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		for(String s : words) {
			if(ls.add(s)) {
				str2 = str2 + s + " ";
			}
		}
		
		System.out.println(str2.trim());

	}

}

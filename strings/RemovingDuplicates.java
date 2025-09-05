package strings;

public class RemovingDuplicates {
	public static void main(String[] args) {
		String input = "Programming";
		
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if(result.indexOf(ch) == -1) {
				result += ch;
			}
		}
		System.out.println("String after removing duplicates: "+ result);
	}
}

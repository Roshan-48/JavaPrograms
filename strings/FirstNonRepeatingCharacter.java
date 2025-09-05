package strings;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String input = "swiss";
		
		int[] freq = new int[256];
		
		for (int i = 0; i < input.length(); i++) {
			freq[input.charAt(i)]++;
		}
		
		char result = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if(freq[input.charAt(i)] == 1) {
				result = input.charAt(i);
				break;
			}
		}
		
		if(result != 0) {
			System.out.println("First non repeating character: "+ result);
		}
		else {
			System.out.println("No first non repeating character");
		}
	}
}

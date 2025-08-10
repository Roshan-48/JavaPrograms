package strings;

public class PanagramString {	//A pangram is a sentence containing all letters of the Alphabet.
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over a lazy dog"; 
		System.out.println(pangram(s));
	}
	
	public static boolean pangram(String s) {
		int[] ct = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				ct[ch-97]++;
			}
			else if(ch>='A' && ch<='Z') {
				ct[ch-65]++;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (ct[i] == 0) {
				return false; 
			}
		}
		return true;
	}
}

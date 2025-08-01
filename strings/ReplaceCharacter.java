package strings;

public class ReplaceCharacter {
	public static void main(String[] args) {
		String s = "koshanvijaypawak";
		System.out.println(replaceChar(s, 'k', 'r'));
	}
	
	public static String replaceChar(String s, char oldChar, char newChar) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==oldChar) {
				ans += newChar;
			}
			else {
				ans += s.charAt(i);
			}
		}
		return ans;
	}
	
}

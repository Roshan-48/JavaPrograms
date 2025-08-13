package strings;

public class ReverseWordsOfStringWithSplit {
	public static void main(String[]args) {
		String s = "I love Myself";
		System.out.println(reverseWords(s));
	}
	
	public static String reverseWords(String s) {
		String[] words = s.split(" ");
		String ans = "";
		for (int i = 0; i < words.length; i++) {
			ans = ans+reverse(words[i])+" ";
		}
		return ans.trim();
	}
	
	public static String reverse(String s) {
		String ans = "";
		char ch = s.charAt(s.length()-1);
		
		if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z' || ch>='0' && ch<='9') {
			for(int i = s.length()-1; i>=0; i--) {
				ans = ans + s.charAt(i);
			}
			return ans;
		}
		
		for(int i=s.length()-2; i>=0; i--) {
			ans = ans + s.charAt(i);
		}
		return ans+ch;
	}
}

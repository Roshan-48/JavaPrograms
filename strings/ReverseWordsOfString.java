package strings;

public class ReverseWordsOfString {
	public static void main(String[] args) {
		String s = "I Love Myself!";
		System.out.println(reverseWords(s));
	}
	
	public static String reverseWords(String s) {
		String ans = "";
		String temp = "";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch != ' ') {
				temp += ch;
			}
			else {
				String rev = reverse(temp); 
				if(rev.length()>0) {
					ans = ans+ rev+" ";
				}
				temp = "";
			}
		}
		ans = ans + reverse(temp);
		return ans.trim();
	}
	
	public static String reverse(String s) {
		String ans = "";
		if(s.length()>0) {
			s = s.trim();
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
		return ans;
	}
}

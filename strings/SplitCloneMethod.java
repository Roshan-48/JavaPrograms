package strings;

import java.util.Arrays;

public class SplitCloneMethod {
	public static void main(String[] args) {
		String s = "I Love Bharat";
		System.out.println(Arrays.toString(split(s,' ')));
	}
	
	public static String[] split(String s, char ref) {
		int ct = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==ref) {
				ct++;
			}
		}
		String[] ans = new String[ct+1];
		String temp = "";
		
		for(int i=0, j=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=ref) {
				temp += ch;
			}
			else {
				ans[j++] = temp;
				temp = "";
			}
		}
		ans[ans.length-1] = temp;
		return ans;
	}
}

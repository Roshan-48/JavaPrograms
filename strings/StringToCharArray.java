package strings;

import java.util.Arrays;

public class StringToCharArray {
	
	public static void main(String[] args) {
		String s = "roshanpawar";
		char[] result = convertToCharArray(s);
		System.out.println(Arrays.toString(result));
	}
	
	public static char[] convertToCharArray(String s) {
		char[] ar = new char[s.length()];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.charAt(i);
		}
		return ar;
	}
}

package strings;

import java.util.Arrays;

public class StringToByteArray {
	public static void main(String[] args) {
		String s = "roshanpawar";
		byte[] result = convertToByteArray(s);
		System.out.println(Arrays.toString(result));
	}
	
	public static byte[] convertToByteArray(String s) {
		byte[] ar = new byte[s.length()];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (byte)s.charAt(i);
		}
		return ar;
	}
}

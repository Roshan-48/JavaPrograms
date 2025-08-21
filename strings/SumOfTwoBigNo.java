package strings;

import java.math.BigDecimal;

public class SumOfTwoBigNo {
	public static void main(String[] args) {
		String s1 = "835798542";
		String s2 = "846856446765";
		System.out.println(sum(s1,s2));
		System.out.println(product(s1,s2));
	}
	
	public static String product(String s1, String s2) {
		BigDecimal d1 = new BigDecimal(s1);
		BigDecimal d2 = new BigDecimal(s2);
		
		return ""+d1.multiply(d2);
	}
	
	public static String sum(String s1, String s2) {
		try {
			String ans = "";
			int lengthDiff = s1.length()-s2.length();
			if(lengthDiff>0) {
				s2 = ("0".repeat(lengthDiff))+s2;
			}
			else {
				s1 = ("0".repeat(-lengthDiff))+s1;
			}
			
			int carry = 0;
			for (int i = s1.length()-1; i >= 0; i--) {
				int sum = (s1.charAt(i)-48) + (s2.charAt(i)-48)+carry;
				carry = 0;
				if(sum<=9) {
					ans = sum + ans;
				}
				else {
					ans = (sum%10) + ans;
					carry = sum/10;
				}
			}
			if(carry>0) {
				ans = carry+ans;
			}
			return ans;
		} catch (NumberFormatException e) {
			return "";
		}
	}
}

package practice;

public class PalindromeString {
	public static void main(String[] args) {
		String s = "madam";
		int i;
		for (i = 0; i <= s.length()/2; i++) {
			if(s.charAt(i)!= s.charAt(s.length()-i-1)) {
				break;
			}
		}
		if(i>=s.length()/2) {
			System.out.println("It is Palindromic String");
		}
		else {
			System.out.println("It is not Palindromic String");
		}
	}
}

package strings;

public class ExtractSubString {
	public static void main(String[] args) {
		String s = "jgkhtopegmbcphtrjdsmhld";
		System.out.println(subString(s,15,23));
	}
	
	public static String subString(String s, int start, int end) {
		if(start<end) {
			String ans = "";
			for (int i = start; i < end; i++) {
				ans += s.charAt(i);
			}
			return ans;
		}
		return s;
	}
}

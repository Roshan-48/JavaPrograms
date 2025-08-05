package strings;

public class IndexOfmethod {
	public static void main(String[] args) {
		String s = "jgkhtopegmbcphtrjdsmhld";
		System.out.println(indexOf(s,'s'));
	}
	
	public static int indexOf(String s, char ch) {
		int i;
		for (i = 0; i < s.length(); i++) {
			if(ch == s.charAt(i)) {
				return i;
			}
		}
		return -1;
	}
}

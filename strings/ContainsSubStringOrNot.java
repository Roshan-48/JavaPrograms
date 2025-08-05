package strings;

public class ContainsSubStringOrNot {
	public static void main(String[] args) {
		String s = "Aeroplane";
		System.out.println(contains(s,"plane"));
	}
	
	public static boolean contains(String s, String t) {
		int check = 0;
		for (int i = 0; i < s.length(); i++) {
			if(check<t.length() && s.charAt(i)==t.charAt(check)) {
				check++;
			}
			else {
				if(check==t.length() || s.charAt(i)==t.charAt(0)) {
					return true;
				}
				else if(check>0) {
					i--;
					check = 0;
				}
			}
		}
		return check == t.length();
	} 
}

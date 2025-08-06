package strings;

public class ContainsLogic2 {
	public static void main(String[] args) {
		String s = "ssspss";
		System.out.println(contains2(s,"sspss"));
	}
	
	public static boolean contains2(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)==s2.charAt(0)) {
				int j=0, k=i;
				for( ; j<s2.length(); ) {
					if(s1.charAt(k)==s2.charAt(j)) {
						j++;
						k++;
					}
					else {
						break;
					}
				}
				if(j==s2.length()) {
					return true;
				}
			}
		}
		return false;
	}
}

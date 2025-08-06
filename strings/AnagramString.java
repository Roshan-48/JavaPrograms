package strings;

public class AnagramString {
	public static void main(String[] args) {  //Both the String have same characters with same frequency they are Anagrams
		String s = "listen";
		String s1 = "silent";
		System.out.println(checkAnagram(s,s1));
	}
	
	public static boolean checkAnagram(String s, String s1) {
		if(s.length()==s1.length()) {
			int[] ar1 = new int[127];
			int[] ar2 = new int[127];
			
			for (int i = 0; i < s.length(); i++) {
				ar1[s.charAt(i)]++;
				ar2[s1.charAt(i)]++;
			}
			for (int i = 0; i < ar2.length;i++) {
				if(ar1[i] != ar2[i]) {
					return false;
				}	
			}
			return true;
		}
		return false;
	}
}

package strings;

public class StringSorting {				//Bubble Sort
	public static void main(String[] args) {
		String s = "jgkhtopegmbcphtrjdsmhld";
		System.out.println(sort(s));
	}
	
	public static String sort(String s) {
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length-1;i++) {
			for (int j = 0; j < ch.length-1-i; j++) {
				if(ch[j] > ch[j+1]) {
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		return new String(ch);
	}
}

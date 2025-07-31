package strings;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
		
		System.out.println(s.charAt(0));
		System.out.println(s.codePointAt(9));
		System.out.println(s.codePointBefore(9));
		
		System.out.println(s.codePointCount(0, 9));
		
		System.out.println("Vinay".compareTo("Vijay"));
		System.out.println("Vinay".compareToIgnoreCase("vijay"));
		
		System.out.println("Hi".concat("Hello"));
		
		System.out.println(s.contains("volcano"));
		
		System.out.println("Hi".contentEquals("Hi"));
		
		System.out.println(s.endsWith("sis"));
		System.out.println(s.startsWith("sis"));
		
		byte[] ar = s.getBytes();
		System.out.println((Arrays.toString(ar)));
		
		System.out.println(s.indent(10));
		
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('o', 6));
		System.out.println(s.indexOf("volcano"));
		
		System.out.println("".isBlank());
		System.out.println("   ".isEmpty());
		
		System.out.println(s.lastIndexOf('o'));
		
		System.out.println(s.length());
		
		System.out.println("ABC".repeat(5));
		
		System.out.println(s.replace("volcano","tsunami"));
		
		String s2 = "I Love India";
		String[] words = s2.split(" ");
		System.out.println(Arrays.toString(words));
		
		System.out.println("    ABC    ".strip());
		
		System.out.println(s.substring(9));
		System.out.println(s.substring(9,15));
		
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}
}

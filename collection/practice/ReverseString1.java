package practice;

public class ReverseString1 {
	public static void main(String[] args) {
		String s = "Roshan pawar";
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev += s.charAt(i);
		}
		
		System.out.println("Revrse Of String: "+rev);
	}
}

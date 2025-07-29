package twoDArrays;

public class DiscountCmp1 {
	public static void main(String[] args) {
		int n =7;
		int[] ar = {9,-13,8,-7,-8,18,10};
		int amt = 18;
		
		noOfProducts(n,ar,amt);
	}
	
	public static void noOfProducts(int n, int[]ar, int amt) {
		int ct = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>0 && amt%ar[i]==0 || ar[i]<0 && amt%(-ar[i])==0) {
				ct++;
			}
		}
		System.out.println(ct);
	}
}

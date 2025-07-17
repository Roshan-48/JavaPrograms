package arrays;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50};
		int [] ans = reverseCopy(ar);
		
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(reverseTheCopy(ar)));
	}
	
	public static int[] reverseCopy(int[]ar) {	//With another array but 1st Logic
		int[] rev = new int[ar.length];
		for(int i=0; i<ar.length;i++) {
			rev[ar.length-1-i] = ar[i];
		}
		return rev;
	}
	
	public static int[] reverseTheCopy(int[]ar) {	//With another array but 2nd Logic
		int i=0, j=ar.length-1;
		int rev[] = new int[ar.length];
		while(i<=j) {
			rev[i] = ar[j];
			rev[j] = ar[i];
			i++;
			j--;
		}
		return rev;
	}
}

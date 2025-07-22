
package arrays;

import java.util.Arrays;

public class ReverseCopy {

	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50};
		
		System.out.println(Arrays.toString(reverseArray(ar)));
		
		reverseTheArray(ar);
		System.out.println(Arrays.toString(ar));
		
		reverseTheArray1(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	public static int[] reverseArray(int[]ar) {	
		int[] rev = new int[ar.length];
		for(int i=0, j=ar.length-1; i<ar.length; i++,j--) {
			rev[j] = ar[i];
		}
		return rev;
	}
	
	public static void reverseTheArray(int[]ar) {	//With third variable in the same Array
		int i=0, j=ar.length-1;
		while(i<j) {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			
			i++;
			j--;
		}
	}
	
	public static void reverseTheArray1(int[]ar) {	//Without third variable in the same Array
		int i=0, j=ar.length-1;
		while(i<j) {
			ar[i] = ar[i] + ar[j];
			ar[j] = ar[i] - ar[j];
			ar[i] = ar[i] - ar[j];
			i++;
			j--;
		}
	}
	
}

package arrays;

import java.util.Arrays;

public class SortingOfArray {
	
	public static void main(String[] args) {
		int[]ar = {20,3,1,100,-8};
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	public static void bubbleSort(int[]ar) {					//O(n^2)
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length-1-i; j++) {
				if(ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
	}
}

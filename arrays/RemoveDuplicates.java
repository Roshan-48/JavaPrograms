 package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,1,5,2,2,6,7,5};
		System.out.println(Arrays.toString(removeDuplicates(ar)));
	}
	
	public static int[] removeDuplicates(int[]ar) {
		int[] freq = FrequencyOfElements.frequencyElements(ar);
		int negCount = 0;
		for(int i=0; i<freq.length; i++) {
			if(freq[i] == -1) {
				negCount++;
			}
		}
		int []ans = new int[ar.length - negCount];
		for(int i=0, j=0; i<ar.length; i++) {
			if(freq[i] != -1) {
				ans[j++] = ar[i];
			}
		}
		return ans;
	}
}

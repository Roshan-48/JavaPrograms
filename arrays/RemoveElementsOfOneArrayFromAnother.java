package arrays;

import java.util.Arrays;

public class RemoveElementsOfOneArrayFromAnother {
	public static void main(String[] args) {
		int []a = {10,20,30,40,50,60,70,80,90};
		int []b = {30,50,80};
		System.out.println(Arrays.toString(removeElements(a,b)));
	}
	
	public static int[] removeElements(int[]a, int[]b) {
		boolean[] occ = new boolean[a.length];
		int ct = 0;
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(b[i] == a[j]) {
					ct++;
					occ[j] = true;
				}
			}
		}
		if(ct>0) {
			int[] ans = new int[a.length-ct];
			for(int i=0, j=0; i<a.length; i++) {
				if(occ[i] != true) {
					ans[j] = a[i];
					j++;
				}
			}
			return ans;
		}
		return a;
	}
}

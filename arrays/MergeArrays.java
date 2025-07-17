package arrays;

import java.util.Arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int[] a = {9,8,7,6,5,4};
		int[] b = {10,20,30,40,50,60};
		
		int[]ans = reverseMergeBothArray(a,b);
		System.out.println(Arrays.toString(ans));
		
		System.out.println(Arrays.toString(reverseMergeFirstArray(a,b)));
		System.out.println(Arrays.toString(reverseMergeSecondArray(a,b)));
		System.out.println(Arrays.toString(zigZagMergeArray(a,b)));
	}
	
	public static int[] reverseMergeBothArray(int[]a, int[]b) {
		int[] ans = new int[a.length+b.length];
		
		for(int i=0; i<ans.length;i++) {
			if(i<a.length) {
				ans[i] = a[a.length-1-i];
			}
			else {
				ans[i] = b[ans.length-1-i];
			}
		}
		return ans;
	}
	
	public static int[] reverseMergeFirstArray(int[]a, int[]b) {
		int[] ans = new int[a.length+b.length];
		
		for(int i=0; i<ans.length;i++) {
			if(i<a.length) {
				ans[i] = a[a.length-1-i];
			}
			else {
				ans[i] = b[i - a.length];
			}
		}
		return ans;
	}
	
	public static int[] reverseMergeSecondArray(int[]a, int[]b) {
		int[] ans = new int[a.length+b.length];
		
		for(int i=0; i<ans.length;i++) {
			if(i<a.length) {
				ans[i] = a[i];
			}
			else {
				ans[i] = b[ans.length-1-i];
			}
		}
		return ans;
	}
	
	public static int[] zigZagMergeArray(int[]a, int[]b) {
		int[] ans = new int[a.length+b.length];
		int mem = 0;
		if(a.length>b.length) {
			int i;
			for(i=0;i<b.length;i++,mem+=2) {
				ans[mem] = a[i];
				ans[mem+1] = b[i];
			}
			while(i<a.length) {
				ans[mem] = a[i];
				mem++;
				i++;
			}
		}
		else if(a.length<b.length) {
			int i;
			for(i=0;i<a.length;i++,mem+=2) {
				ans[mem] = a[i];
				ans[mem+1] = b[i];
			}
			while(i<b.length) {
				ans[mem] = b[i];
				mem++;
				i++;
			}
		}
		else {
			int i;
			for(i = 0; i < a.length; i++, mem += 2) {
				ans[mem] = a[i];
				ans[mem + 1] = b[i];
			}
		}
		return ans;
	}

}

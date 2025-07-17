package arrays;
import java.util.*;
public class MergingByTwoPointer {
	public static void main(String[] args) {
		int[] a = {5,15,18,20,55,60};
		int[] b = {2,3,8,12,18,25,32,50,63};
		System.out.println(Arrays.toString(merge(a,b)));
		
		int[]ar = {3,5,9,15,18,50,8,12,17,19,21,25};
		System.out.println(Arrays.toString(mergeSameArray(ar)));
	}
	
	public static int[] merge(int[]a, int[]b){
		int[] ans = new int[a.length+b.length];
		int i=0, j=0, k=0;
		while(i<a.length && j<b.length) {
			if(a[i] <= b[j]) {
				ans[k] = a[i];
				k++;
				i++;
			}
			else if(a[i] > b[j]) {
				ans[k] = b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			ans[k] = a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			ans[k] = b[j];
			k++;
			j++;
		}
		return ans;
	}
	
	public static int[] mergeSameArray(int[]a) {
		int[] ans = new int[a.length];
		int i=0, j=a.length/2, k=0;
		while(i<a.length/2 && j<a.length) {
			if(a[i] <= a[j]) {
				ans[k++] = a[i++];
			}
			else if(a[i] > a[j]) {
				ans[k++] = a[j++];
			}
		}
		while(i<a.length/2) {
			ans[k++] = a[i++];
		}
		while(j<a.length) {
			ans[k++] = a[j++];
		}
		return ans;
	}
}

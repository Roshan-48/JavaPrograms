package arrays;

import java.util.Arrays;

public class PushPositiveNegativeLogic2 {
	public static void main(String[] args) {
		int[] arr = {3,-2,1,10,8,-3,-9,0};
		negativePositiveArray(arr);
	}
	public static void negativePositiveArray(int[]arr) {
		int i = 0, j=arr.length-1;
		while(i<j) {
			while(arr[i]<0) {
				i++;
			}
			while(arr[j]>=0) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

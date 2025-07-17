package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementOfArrayLogic2 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the index to remove element: ");
		int index = sc.nextInt();
		removeElementOfIndex(arr,index);
		sc.close();
	}
	public static void removeElementOfIndex(int[]arr,int index) {
		int[] ans = new int[arr.length-1];
		for(int i=0,j=0; i<arr.length;i++) {
			if(i==index) {
				continue;
			}
			else {
				ans[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}


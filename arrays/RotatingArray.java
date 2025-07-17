package arrays;

import java.util.*;

public class RotatingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the time you want to rotate the array: ");
		int times = sc.nextInt();
		sc.close();
		
		int[] ar = {10,20,30,40,50,60};
		leftRotate(ar,times);
		System.out.println(Arrays.toString(ar));
		rightRotate(ar,times);
		System.out.println(Arrays.toString(ar));
	}
	
	public static void leftRotate(int[]ar, int times) {
		for(int i=0; i<times; i++) {
			int temp = ar[0];
			for(int j=1; j<ar.length; j++) {
				ar[j-1] = ar[j];
			}
			ar[ar.length-1] = temp;
		}
	}
	
	public static void rightRotate(int[]ar, int times) {
		for(int i=0; i<times; i++) {
			int temp = ar[ar.length-1];
			for(int j=ar.length-1; j>0; j--) {
				ar[j] = ar[j-1];
			}
			ar[0] = temp;
		}
	}
}

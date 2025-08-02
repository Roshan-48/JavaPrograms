package arrays;
import java.util.*;
public class AddElementOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to add in an array: ");
		int ele = sc.nextInt();
		System.out.print("Enter an index where to add an element: ");
		int index = sc.nextInt();
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		addElementAtIndex(arr,ele,index);
		sc.close();
	}
	
	public static void addElementAtIndex(int[]arr, int ele, int index) {
		if(index>=0 && index<=arr.length) {
			int[] ans = new int[arr.length+1];
			for(int i=0; i<ans.length; i++) {
				if(i<index) {
					ans[i] = arr[i];
				}
				else if(i==index) {
					ans[i] = ele;
				}
				else {
					ans[i] = arr[i-1];
				}
			}
			System.out.println(Arrays.toString(ans));
		}
		else
			System.out.println("Index is not present");
	}
}

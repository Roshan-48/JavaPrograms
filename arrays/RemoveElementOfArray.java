package arrays;
import java.util.*;

public class RemoveElementOfArray {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the index to remove element: ");
		int index = sc.nextInt();
		removeIndex(arr,index);
		sc.close();
	}
	
	public static void removeIndex(int arr[],int index) {
		int[] ans = new int [arr.length-1];
		for(int i=0; i<arr.length;i++) {
			if(i<index) {
				ans[i] = arr[i];
			}
			else if(i>index) {
				ans[i-1] = arr[i];
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}

package arrays;							//Problem in this problem
import java.util.*;
public class RemoveRangeOfElements {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start index of array: ");
		int start = sc.nextInt();
		System.out.print("Enter the end index of array: ");
		int end = sc.nextInt();
		
		int[] arr = {10,20,30,40,50,60,70,80};
		System.out.println(Arrays.toString(removeRange(arr,start,end)));
		sc.close();
	}
	
	public static int[] removeRange(int[]arr, int start, int end, boolean inc) {
		if(inc) {
			return removeRange(arr,start,end+1);
		}
		return removeRange(arr,start,end);
	}
	
	public static int[] removeRange(int[]arr,int start, int end) {
		if(start>=0 && end<arr.length && start<end) {
			int[] ans = new int[arr.length-(end-start)];
			for(int i=0, j=0; i<arr.length;i++) {
				if(i<start) {
					ans[j] = arr[i];
					j++;
				}
				else if(i==start) {
					ans[j] = arr[i+(end-start)];
					j++;
				}
				else if(i>end) {
					ans[j] = arr[i];
					j++;
				}
			}
			return ans;
		}
		return null;
	}
}

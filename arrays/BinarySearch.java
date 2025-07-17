package arrays;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element which we want to search: ");
		int ele = sc.nextInt();
		int[] ar = {10,5,4,66,48,29,45,7,962,74,82,8};
		
		binarySearch(ar,ele);
		sc.close();
	}
	
	public static void binarySearch(int[]ar, int ele) {
		SortingOfArray.bubbleSort(ar);
		int start=0, end=ar.length-1, mid=(start+end)/2;
		while(start<=end) {
			if(ar[mid]==ele) {
				System.out.println("Element "+ele+" found at index "+mid);
				break;
			}
			else if(ele>ar[mid]) {
				start = mid+1;
			}
			else if(ele<ar[mid]) {
				end = mid -1;
			}
			mid = (start+end)/2;
		}
		if(ar[mid] != ele) {
			System.out.println("Element not found");
		}
	}
}

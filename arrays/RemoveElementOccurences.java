package arrays;
import java.util.*;
public class RemoveElementOccurences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element which occurances has to remove: ");
		int ele = sc.nextInt();
		int []ar = {1,2,1,3,4,1,3,5,6,7,4,4,8};
		System.out.println(Arrays.toString(removeOccurances(ar,ele)));
		sc.close();
	}
	
	public static int[] removeOccurances(int []ar, int ele) {
		int ct = 0;
		for(int i=0; i<ar.length;i++) {
			if(ar[i] == ele) {
				ct++;
			}
		}
		if(ct>0) {
			int[] ans = new int[ar.length - ct];
			for(int i=0, j=0; i<ar.length; i++) {
				if(ar[i] != ele) {
					ans[j++] = ar[i];
				}
			}
			return ans;
		}
		return ar;
	}
}

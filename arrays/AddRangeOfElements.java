package arrays;
import java.util.*;
public class AddRangeOfElements {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70};
		int[] b = {100,200,300};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Index to add elements: ");
		int index = sc.nextInt();
		System.out.println(Arrays.toString(insertAtIndex(a,b,index)));
		sc.close();
	}
	
	public static int[] insertAtIndex(int[]a,int[]b,int index) {
		if(index>=0 && index<=a.length) {
			int[]ans = new int[a.length+b.length];
			for(int i=0; i<ans.length; i++) {
				if(i<index) {
					ans[i] = a[i];
				}
				else if(i<b.length+index) {
					ans[i] = b[i-index];
				}
				else {
					ans[i] = a[i-b.length];
				}
			}
			return ans;
		}
		return null;
	}
}

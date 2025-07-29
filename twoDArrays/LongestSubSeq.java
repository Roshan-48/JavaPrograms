package twoDArrays;

public class LongestSubSeq {
	public static void main(String[] args) {
//		int[] ar = {1,1,1,2,2,2,1,0,0,0,1,1,1,1,2,3};
		int[] ar = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3};
		int max=0, ct=0, num=ar[0];
		for (int i = 0; i < ar.length-1; i++) {
			if(ar[i] == ar[i+1]) {
				ct++;
			}
			else {
				if(ct>max) {
					max=ct;
					num=ar[i];
				}
				ct=0;
			}
		}
		if(ct>max) {
			max=ct;
			num = ar[ar.length-1];
		}
		if(max>0) {
			System.out.println(num+" is repeated for "+(max+1)+" times");
		}
		else {
			System.out.println("No repeated elements");
		}
	}
}

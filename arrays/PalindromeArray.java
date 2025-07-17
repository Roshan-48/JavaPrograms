package arrays;

public class PalindromeArray {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,3,2,1};
		System.out.println(checkPalindrome(ar));
	}
	
	public static boolean checkPalindrome(int[]ar) {
		int i=0, j=ar.length-1;
		while(i<=j) {
			if(ar[i] == ar[j]) {
				i++;
				j--;
			}
			else {
				break;
			}
		}
		return i>j;
	}
}

package arrays;

public class SingleMissingElement {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,6,7,8,9};
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<ar.length;i++) {
			sum += ar[i];
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		int sumOfNat = max*(max+1)/2;
		System.out.println("The missing element is: "+(sumOfNat-sum));
	}
}

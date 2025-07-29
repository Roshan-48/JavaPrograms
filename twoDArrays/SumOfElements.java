package twoDArrays;

//import java.util.Iterator;

public class SumOfElements {
	
	public static void main(String[] args) {
		
		int[] ar = {10,20,30,40,50};
		System.out.println(sumOfElements(ar));
	}
	
	public static int sumOfElements(int[]ar) {
		int sum = 0;
		for(int i=0; i<ar.length;i++) {
			sum += ar[i];
		}
		return sum;
	}
}

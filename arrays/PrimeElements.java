package arrays;

public class PrimeElements {
	public static void main(String[] args) {
		int[] arr = {1,8,9,11,12,13,14,15,16,17};
		checkPrime(arr);
	}
	
	public static void checkPrime(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>1) {
				boolean flag = true;
				
				for(int j=2; j<=arr[i]/2; j++) {
					if(arr[i]%j == 0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}

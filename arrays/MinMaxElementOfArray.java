package arrays;

public class MinMaxElementOfArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("First maximum element of array: "+firstMaxElement(a));
		System.out.println("First minimum element of array: "+firstMinElement(a));
		
		System.out.println("Second maximum element of array: "+secondMaxElement(a));
		System.out.println("Second minimum element of array: "+secondMinElement(a));
		
		System.out.println("Third maximum element of array: " + thirdMaxElement(a));
		System.out.println("Third minimum element of array: " + thirdMinElement(a));
	}
	
	public static int firstMaxElement(int[]ar) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		return max;
	}
	
	public static int firstMinElement(int[]ar) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<min) {
				min = ar[i];
			}
		}
		return min;
	}
	
	public static int secondMaxElement(int[]ar) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				secMax = max;
				max = ar[i];
			}
			else if(ar[i]>secMax && ar[i]!=max) {
				secMax = ar[i];
			}
		}
		return secMax;
	}
	
	public static int secondMinElement(int[]ar) {
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<min) {
				secMin = min;
				min = ar[i];
			}
			else if(ar[i]>min && ar[i]<secMin) {
				secMin = ar[i];
			}
		}
		return secMin;
	}
	
	public static int thirdMaxElement(int[] ar) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > first) {
				thirdMax = second;
				second = first;
				first = ar[i];
			} else if (ar[i] > second && ar[i] != first) {
				thirdMax = second;
				second = ar[i];
			} else if (ar[i] > thirdMax && ar[i] != first && ar[i] != second) {
				thirdMax = ar[i];
			}
		}
		return thirdMax;
	}
	
	public static int thirdMinElement(int[] ar) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < first) {
				thirdMin = second;
				second = first;
				first = ar[i];
			} else if (ar[i] < second && ar[i] != first) {
				thirdMin = second;
				second = ar[i];
			} else if (ar[i] < thirdMin && ar[i] != first && ar[i] != second) {
				thirdMin = ar[i];
			}
		}
		return thirdMin;
	}
}


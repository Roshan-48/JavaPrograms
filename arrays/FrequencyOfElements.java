package arrays;

public class FrequencyOfElements {
	public static void main(String[] args) {
		int []ar = {1,2,1,3,4,1,3,5,6,7,4,4,8,9};
		int[] result = frequencyElements(ar);
		
		for(int i=0; i<result.length; i++) {
			if(result[i] != -1) {
				System.out.print(+result[i]+" ");
			}
		}
	}
	
	public static int[] frequencyElements(int[] ar) {
		int[] count = new int[ar.length];
		for(int i=0; i<ar.length; i++) {
			int ct = 1;
			if(count[i] != -1) {
				for(int j = i+1; j<ar.length; j++) {
					if(ar[i] == ar[j]) {
						ct++;
						count[j] = -1;
					}
				}
				count[i] = ct;
			}
		}
		return count;
	}
}

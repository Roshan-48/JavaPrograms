package arrays;

public class LeadersCmp2 {
	 public static void main(String[] args) {
	        int[] ar = {16, 17, 4, 3, 5, 2};

	        for (int i = 0; i < ar.length; i++) {
	            boolean isLeader = true; 

	            for (int j = i + 1; j < ar.length; j++) {
	                if (ar[i] < ar[j]) { 
	                    isLeader = false;
	                    break;
	                }
	            }

	            if (isLeader) {
	                System.out.print(ar[i] + " ");
	            }
	        }
	 }
}

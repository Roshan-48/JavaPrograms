package arrays;
public class DuplicatesElementArray {
	 public static void findDuplicates(int[] arr) {
	        System.out.print("Duplicate elements: ");
	        boolean[] visited = new boolean[arr.length];

	        for (int i = 0; i < arr.length; i++) {
	            if (visited[i]) continue;

	            boolean isDuplicate = false;
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    visited[j] = true;
	                    isDuplicate = true;
	                }
	            }
	            if (isDuplicate) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};
	        findDuplicates(arr);  
	    }
}

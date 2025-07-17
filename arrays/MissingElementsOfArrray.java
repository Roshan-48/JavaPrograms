package arrays;

public class MissingElementsOfArrray {
	    public static void main(String[] args) {
	        int[] arr = {1,2,3,4,5,7,8,10,11};
	        missingNum(arr);
	    }
	    public static void missingNum(int[] a){
	        for(int i=0; i<a.length-1; i++){
	            if(a[i]+1!=a[i+1]){
	                System.out.println(a[i]+1);
	            }
	        }
	    }
}

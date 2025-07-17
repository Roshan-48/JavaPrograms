package arrays;
import java.util.Arrays;
public class HalfArrayReverse {
	
		public static int[] reverseHalfArray(int[]arr)
		{
			int[]revHalfArr = new int[arr.length];
			
			for(int i=0,j=arr.length-1;i<arr.length;i++)
			{
				if(i<(arr.length/2))
					revHalfArr[i]=arr[i];
				else
				{
					revHalfArr[j]=arr[i];
					j--;
				}
			}
			return revHalfArr;			
		}
		
		public static void main(String[] args)
		{
			int[]arr = {1,2,3,4,5,6,7,8,9};
			
			System.out.println(Arrays.toString(reverseHalfArray(arr)));
		}
}

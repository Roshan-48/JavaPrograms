package arrays;
import java.util.Arrays;
public class PushPositiveNegativeOtherSide {
		
		public static int[] pushPositiveAndNegative(int[]arr)
		{
			int[]newArr = new int[arr.length];
			
			for(int i=0,j=0,k=arr.length-1;i<arr.length;i++)
			{
				if(arr[i]>0)
				{
					newArr[j] = arr[i];
					j++;
				}
				else
				{
					newArr[k] = arr[i];
					k--;
				}
			}
			return newArr;
		}
		
		public static void main(String[]args)
		{
			int[]arr = {1,-2,3,-3,-4,-1,-8,4,8,7};
			
			System.out.println(Arrays.toString(pushPositiveAndNegative(arr)));
		}
}

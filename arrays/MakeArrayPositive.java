package arrays;
import java.util.Arrays;
public class MakeArrayPositive {
			
		static int[] makePositive(int[]arr)
		{
			int[]pArr = new int[arr.length];
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<0)
					pArr[i]=arr[i]*(-1);
				else
					pArr[i]=arr[i];
			}
			
			return pArr;
		}
		
		static int[] makeNegative(int[]arr)
		{
			int[]nArr = new int[arr.length];
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>0)
					nArr[i]=arr[i]*-1;
				else
					nArr[i]=arr[i];
			}
			
			return nArr;
		}
		
		static int[] makePositiveToNegativeViceVerca(int[]arr)
		{
			int[]alternate = new int[arr.length];
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<0)
					alternate[i]=arr[i]*-1;
				else if(arr[i]>0)
					alternate[i]=arr[i]*-1;
			}
			
			return alternate;
		}
		
		public static void main(String[]args)
		{
			int[]arr = {-1,-2,3,-3,-4,-1,-8,4,-8,7};
			
			//This method is convert array into positive
			System.out.println(Arrays.toString(makePositive(arr)));
			//This method is convert array into negative
			System.out.println(Arrays.toString(makeNegative(arr)));
			//This method is convert positive into negative and negative into positive
			System.out.println(Arrays.toString(makePositiveToNegativeViceVerca(arr)));
		}
}

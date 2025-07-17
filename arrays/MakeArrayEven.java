package arrays;
import java.util.Arrays;
public class MakeArrayEven {		
		static int[] mekeEven(int[]arr)
		{
			int[]even = new int[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0)
					even[i]=arr[i];
				else
					even[i]=++arr[i];
			}
			return even;
		}
		
		public static void main(String[]args)
		{
			int[]arr= {7,1,2,3,6,5,8,7,9,1};
			
			System.out.println(Arrays.toString(mekeEven(arr)));
		}
}

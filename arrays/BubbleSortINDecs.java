package arrays;
import java.util.Arrays;
public class BubbleSortINDecs {
	public static void bubbleSort(int[]arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Bubble sort in Descending Order: "+Arrays.toString(arr));
	}
	
	public static void main(String[]a)
	{
		int[]dsc = {1,2,3,4,5,6,7,8,9};
		bubbleSort(dsc);
	}
}

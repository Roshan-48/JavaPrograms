package arrays;
import java.util.Arrays;
public class BubbleSort {
	public static void bubbleSort(int[]arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Bubble sort: "+Arrays.toString(arr));
	}
	
	public static void main(String[]a)
	{
		int[]arr = {9,8,7,5,4,3,2,1};
		bubbleSort(arr);
	}
}

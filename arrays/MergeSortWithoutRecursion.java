package arrays;
import java.util.Arrays;
public class MergeSortWithoutRecursion {		//ONLY WHEN HALF-HALF ARRAY IS ALREADY SORTED
	public static int[] mergeSort(int[]a)
	{
		int ans[] = new int[a.length];
		
		int i=0, j=a.length/2, k=0;
		
		while(i<a.length/2 && j<a.length)
		{
			if(a[i]<=a[j])
			{
				ans[k++] = a[i++];
			}
			if(a[i]>a[j])
			{
				ans[k++] = a[j++];
			}
		}
		while(i<a.length/2)
		{
			ans[k++] = a[i++];
		}
		while(j<a.length)
		{
			ans[k++] = a[j++];
		}
		return ans;
	}
	
	public static void main(String[]args)
	{
		int[]a= {2,3,8,12,19,5,25,32,50,63};
		
		System.out.println(Arrays.toString(mergeSort(a)));
	}
}

package arrays;
import java.util.Arrays;

public class RemoveElementByElement {
	
	public static int[] removeElement(int[]arr,int ele)
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			int[]ans = new int[arr.length-1];
			for(int i=0,j=0;i<arr.length;i++)
			{
				if(arr[i]==ele)
				{
					for (int k = i + 1; k < arr.length; k++, j++) {
						ans[j] = arr[k];
					}
					break;
				}
				else
				{
					ans[j++] = arr[i];
				}
			}
			return ans;
		}
		else
		{
			System.out.println("Element not present.!");
			return null;
		}
	}
	
	public static void main(String[] args)
	{
		int[]arr = {9,8,7,7,46,1,1,0,20};
		
		System.out.println(Arrays.toString(removeElement(arr,7)));
	}
}

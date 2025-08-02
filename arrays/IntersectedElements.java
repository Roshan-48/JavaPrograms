package arrays;
import java.util.Arrays;
public class IntersectedElements {
	public static void removeSameElement(int[]a,int[]b)
	{
		boolean[]occ = new boolean[a.length];
		int cnt=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(b[i] == a[j])
				{
					cnt++;
					occ[j] = true;
				}
			}
		}
		if(cnt>0)
		{
			int[]ans = new int[cnt];
			for(int i=0,j=0;i<a.length;i++)
			{
				if(occ[i]==true)
				{
					ans[j++] = a[i];
				}
			}
			System.out.println("Intersected elements of array: "+Arrays.toString(ans));
		}
		
	}	
	
	public static void main(String[]args)
	{
		int[]arr1 = {1,2,3,4,5};
		int[]arr2 = {2,4,8,9};
		removeSameElement(arr1, arr2);
	}
}

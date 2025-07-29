package twoDArrays;
import java.util.*;
public class SumOfTwoMatrix {
	
	public static int[][] TwoMatrixAdd(int[][]a,int[][]b)
	{
		int i=0;
		if(a.length==b.length)
		{
			for(i=0;i<a.length;i++)
				if(a[i].length!=b[i].length)
					return null;
		}
		if(i==a[0].length)
		{
			int[][]sum = new int[a.length][a[0].length];
			
			for(int j=0;j<a.length;j++)
				for(int k=0;k<a[j].length;k++)
					sum[j][k] = a[j][k] + b[j][k];
			return sum;
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		int[][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		int[][]b = {
				{10,11,12},
				{13,14,15},
				{17,18,19},
		};
		int[][]sum = TwoMatrixAdd(a, b);
		
		if(sum!=null)
			for(int i=0;i<sum.length;i++)
				System.out.println(Arrays.toString(sum[i]));
		else
			System.out.println(Arrays.toString(TwoMatrixAdd(a, b)));
	}
}

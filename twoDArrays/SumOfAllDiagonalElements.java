package twoDArrays;

public class SumOfAllDiagonalElements {
	
	public static int sumOfDiagonal(int[][]ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
			for(int j=0;j<ar[i].length;j++)
				if(i==j)
					sum+=ar[i][j];
		return sum;		
	}
	
	public static void main(String[]args)
	{
		int[][]ar = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		System.out.println(sumOfDiagonal(ar));
	}
}

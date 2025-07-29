package twoDArrays;

public class UpperLowerDiagonalSum {
	
	public static int upperDiagonalElementsSum(int[][]ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
			for(int j=0;j<ar[i].length;j++)
				if(j>=i)
					sum+=ar[i][j];
		return sum;
	}
	public static int lowerDiagonalElementsSum(int[][]ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
			for(int j=0;j<ar[i].length;j++)
				if(j<i)
					sum+=ar[i][j];
		return sum;
	}
	
	public static void main(String[]args)
	{
		int[][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		System.out.println("Upper Diagonal Elements Sum: "+upperDiagonalElementsSum(a));
		System.out.println("Lower Diagonal Elements Sum: "+lowerDiagonalElementsSum(a));
	}
}

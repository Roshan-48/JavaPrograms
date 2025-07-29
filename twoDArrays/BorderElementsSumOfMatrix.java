package twoDArrays;

public class BorderElementsSumOfMatrix {
	
	public static int borderSum(int[][]ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
			for(int j=0;j<ar[i].length;j++)
				if(i==0||j==0||j==ar.length-1||i==ar.length-1)
					sum+=ar[i][j]; 
		return sum;
	}
	
	public static void printBorder(int[][]ar)
	{
		for(int i=0;i<ar.length;i++)
		{	for(int j=0;j<ar[i].length;j++)
			{
				if(i==0||j==0||j==ar.length-1||i==ar.length-1)
					System.out.print(ar[i][j]+" ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}
	
	public static void main(String[]args)
	{
		int[][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		System.out.println(borderSum(a));
		printBorder(a);
	}
}

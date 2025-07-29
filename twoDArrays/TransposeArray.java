package twoDArrays;

public class TransposeArray {
	
	public static char[][] transpose(char[][]ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i;j<ar[i].length;j++)
			{
				if(j>i)
				{
					char temp = ar[i][j];
					ar[i][j] = ar[j][i];
					ar[j][i] = temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		return null;
	}
	
	public static void main(String[]args)
	{
		char[][] ch = {
				{'a','b','c'},
				{'d','e','f'},
				{'g','h','i'},
		};
		transpose(ch);
	}
}

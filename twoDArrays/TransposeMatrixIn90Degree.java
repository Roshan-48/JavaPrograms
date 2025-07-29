package twoDArrays;

public class TransposeMatrixIn90Degree {
	
	public static char[] revArray(char[]ar)
	{
		for(int i=0;i<ar.length/2;i++)
		{
			char ch = ar[i];
			ar[i] = ar[ar.length-1-i];
			ar[ar.length-1-i] = ch;
		}
		return ar;
	}
	
	public static void transpose90Deg(char[][]ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
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
			revArray(ar[i]);
		}
		
		for(int i=0;i<ar.length;i++)
		{	
			for(int j=0;j<ar[i].length;j++)
				System.out.print(ar[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[]args)
	{
		char[][] ch = {
				{'a','b','c','d'},
				{'e','f','g','h'},
				{'i','j','k','l'},
				{'m','n','o','p'},
		};
		transpose90Deg(ch);
	}
}


/*
 * first ill make like this then apply reverse method
a e i m 
b f j n 
c g k o 
d h l p
//after applying rev method
m i e a 
n j f b 
o k g c 
p l h d 
*/

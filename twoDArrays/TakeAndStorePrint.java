package twoDArrays;
import java.util.Scanner;
import java.util.Arrays;
public class TakeAndStorePrint {
	
	public static void main(String[] args)
	{
		int[][]ar = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements: ");
		
		for(int i=0;i<ar.length;i++)
			for(int j =0;j<ar[i].length;j++)
				ar[i][j] = sc.nextInt();
		
		System.out.println("Elements are: ");
		sc.close();
		
		for(int i=0;i<ar.length;i++)
			System.out.println(Arrays.toString(ar[i]));
	}
}

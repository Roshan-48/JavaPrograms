package arrays;
import java.util.Scanner;
public class CheckElementPresnetOrNot {
	
		public static boolean isPresentOrNot(int[]arr,int ele)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==ele)
					return true;
			}
			return false;
		}
		
		public static void main(String[] args)
		{
			int[]arr = {1,2,3,4,5,6,7,8,9,10};
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the element: ");
			int n = sc.nextInt();
			
			System.out.println("Is "+n+" Present in array or not: "+isPresentOrNot(arr, n));
			sc.close();
		}
}

package arrays;
import java.util.Scanner;
public class ElementRepetationCount {
		public static int repetionOfElement(int[]arr,int ele)
		{
			int cnt=0;
			for(int i=0;i<arr.length;i++)
				if(arr[i]==ele)
					cnt++;
			return cnt;
		}
		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			int[]arr = {1,2,3,4,5,6,10,10,7,8,9,10};
			
			System.out.print("Enter an number: ");
			System.out.println("Repetition of an element in Array: "+repetionOfElement(arr, sc.nextInt()));
			sc.close();
		}
}

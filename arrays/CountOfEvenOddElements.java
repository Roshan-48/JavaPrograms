package arrays;

public class CountOfEvenOddElements {
	
		public static void countOfEvenOdd(int[]arr)
		{
			int evenCnt=0,oddCnt=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0)
					evenCnt++;
				else
					oddCnt++;
			}
			System.out.println("Even Number Count: "+evenCnt);
			System.out.println("Odd Number Count: "+oddCnt);
		}
		
		public static void main(String[] args)
		{
			int[]arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
			countOfEvenOdd(arr);
		}
}

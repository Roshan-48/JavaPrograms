package arrays;

public class EvenOddElementsSum {
		public static void evenAndOddSum(int[]arr)
		{
			int evenSum = 0,evenCnt=0;
			int oddSum = 0,oddCnt=0;
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0)
				{
					evenSum+=arr[i];
					evenCnt++;
				}
				else
				{
					oddSum+=arr[i];
					oddCnt++;
				}
			}
			
			if(evenSum==oddSum)
				System.out.println("Even and odd sum is equal");
			
			System.out.println("Even elements sum: "+evenSum+" and total even number in arrays is: "+evenCnt);
			System.out.println("Odd elements sum: "+oddSum+" and total odd number in arrays is: "+oddCnt);
		}
		
		public static void main(String[] args)
		{
			int[]arr = {1,2,3,4,5,6,7,8,9,10};
			
			evenAndOddSum(arr);
		}
}

package arrays;

public class CountOfPrimeElements {
	
		public static boolean isPrime(int num)
		{
			if(num<2) return false;
			for(int den=2;den<num;den++)
			{
				if(num%den==0)
				{
					return false;
				}
			}
			return true;
		}
		
		public static int countOfPrimeNum(int[]arr)
		{
			int cnt=0;
			for(int i=0;i<arr.length;i++)
			{
				if(isPrime(arr[i]))
					cnt++;
			}
			return cnt;
		}
		
		public static void main(String[] args)
		{
			int[]arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
			
			System.out.println("Count of prime number in array: "+countOfPrimeNum(arr));
			
			for(int i=0;i<arr.length;i++)
				if(isPrime(i))
					System.out.print(i+", ");
		}
}

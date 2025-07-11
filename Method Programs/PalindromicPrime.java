import java.util.Scanner;
class PalindromicPrime 
{
	public static void main(String[] args) 
	{
		Scanner dc = new Scanner(System.in);
		System.out.print("Enter a Nubmer: ");
		int ip = dc.nextInt();
		if(ip==reverse(ip) && isPrime(ip))
			System.out.println("It is Palindromic prime");
		else
			System.out.println("It is not a Palindromic prime");
	}
	public static int reverse(int num){
		int rev = 0;
		while(num!=0){
			rev = rev*10 + (num%10);
			num/=10;
		}
		return rev;
	}
	public static boolean isPrime(int num){
		int den = 2;
		for( ;den<num;den++)
			if(num%den==0)
				break;
		return num == den;
	}
}

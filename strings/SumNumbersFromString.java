package strings;

public class SumNumbersFromString {
	public static long sum(String s)
	{
			int sum=0;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch>='0' && ch<='9')
				{
					sum +=(ch-48);
				}
			}
			return sum;
	}
	public static void main(String []args)
	{
		System.out.println(sum("a1b2c5"));
	}
}
 
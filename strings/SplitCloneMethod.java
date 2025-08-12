package strings;
import java.util.Arrays;
public class SplitCloneMethod {
	public static String[] split(String s,String ch)
	{
		int size = 0;
		if(ch!="")
		{
			for(int i=0; i<s.length(); i++) {
				if(ch.charAt(0) == s.charAt(i))
					size++;
			}
			String[] arr = new String[size + 1];
			
			int arrSize = 0;
			String temp = "";
			for(int i=0; i<s.length(); i++) {
				
				if(s.charAt(i) == ch.charAt(0))
				{
					arr[arrSize++] = temp;
					temp = "";
				}
				else
				{
					temp += s.charAt(i);
				}
			}
			arr[size] = temp;
			return arr;
		}
		else
		{
			String[] arr = new String[s.length()];
			for(int i=0; i<s.length(); i++)
				arr[i]= ""+s.charAt(i);
			return arr;
		}
	}
	public static void main(String[]args)
	{
		String s = "i am the boy in india";
		System.out.println("dp: "+Arrays.toString(split(s,"")));
		System.out.println("Og: "+Arrays.toString(s.split("")));
	}
}

package practice;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 5;
		int num = 1;
		for (int i=1;i<=n;i++)
		{
			int start = num + i - 1; 
            for (int j = start; j >= num; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            num += i;
		}
	}
}

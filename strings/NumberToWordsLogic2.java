package strings;
import java.util.Scanner;
public class NumberToWordsLogic2 {
	static String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

    static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0 to 2147483647): ");
        long num = sc.nextLong();
        sc.close();

        if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println(convert(num));   //System.out.println(convert(num).trim());
        }
    }

    public static String convert(long num) {
        if (num < 20) {
            return ones[(int) num];
        } else if (num < 100) {
            return tens[(int) num / 10] + (num % 10 != 0 ? " " + ones[(int) num % 10] : "");
        } else if (num < 1000) {
            return ones[(int) num / 100] + " Hundred" + (num % 100 != 0 ? " " + convert(num % 100) : "");
        } else if (num < 100000) { 
            return convert(num / 1000) + " Thousand" + (num % 1000 != 0 ? " " + convert(num % 1000) : "");
        } else if (num < 10000000) { 
            return convert(num / 100000) + " Lakh" + (num % 100000 != 0 ? " " + convert(num % 100000) : "");
        } else if (num < 1000000000) { 
            return convert(num / 10000000) + " Crore" + (num % 10000000 != 0 ? " " + convert(num % 10000000) : "");
        } else { 
            return convert(num / 1000000000) + " Arab" + (num % 1000000000 != 0 ? " " + convert(num % 1000000000) : "");
        }
    }
}

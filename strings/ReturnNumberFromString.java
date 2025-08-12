package strings;							

public class ReturnNumberFromString {
	public static long returnNum(String s) {
        long nums = 0; 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                nums = nums * 10 + (ch - 48); 
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(returnNum("wrg5eg5er4g4erh4et4h4e6845h86e4"));
    }
}

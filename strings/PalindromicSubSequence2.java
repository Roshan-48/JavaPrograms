package strings;

public class PalindromicSubSequence2 {
	public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        //String s = "abc";
        System.out.println(longestPalSub(s));
    }

    public static String longestPalSub(String s) {
        String original = s;
        s = s.replace("", " ").trim(); 

        int max = 1, i = 0, k = 0, j = 0;
        String longestPal = original.substring(0, 1); 

        while (i < s.length()) {
            if (j > 0 && k < s.length() - 1) {
                if (s.charAt(j - 1) == s.charAt(k + 1)) {
                    j--;
                    k++;
                } else if (k - j > 0) {
                    String temp = s.substring(j, k + 1).replace(" ", "");
                    if (temp.length() > max) {
                        max = temp.length();
                        longestPal = temp;
                    }
                    i++;
                    j = k = i;
                } else {
                    i++;
                    j = k = i;
                }
            } else {
                if (k - j > 0) {
                    String temp = s.substring(j, k + 1).replace(" ", "");
                    if (temp.length() > max) {
                        max = temp.length();
                        longestPal = temp;
                    }
                }
                i++;
                j = k = i;
            }
        }
        return longestPal;
    }
}

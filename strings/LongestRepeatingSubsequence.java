package strings;

public class LongestRepeatingSubsequence {
	    public static void main(String[] args) {
	        String s = "AABEBCDD";
	        System.out.println("Longest Repeating Subsequence: " + longestRepeatingSubsequence(s));
	    }

	    public static String longestRepeatingSubsequence(String s) {
	        int n = s.length();
	        int[][] dp = new int[n + 1][n + 1];

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
	                    dp[i][j] = 1 + dp[i - 1][j - 1];
	                } else {
	                    if (dp[i - 1][j] > dp[i][j - 1]) {
	                        dp[i][j] = dp[i - 1][j];
	                    } else {
	                        dp[i][j] = dp[i][j - 1];
	                    }
	                }
	            }
	        }

	        String lrs = "";
	        int i = n, j = n;
	        while (i > 0 && j > 0) {
	            if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
	                lrs += s.charAt(i - 1);
	                i--;
	                j--;
	            } else {
	                if (dp[i - 1][j] > dp[i][j - 1]) {
	                    i--;
	                } else {
	                    j--;
	                }
	            }
	        }

	        String reversed = "";
	        for (int k = lrs.length() - 1; k >= 0; k--) {
	            reversed += lrs.charAt(k);
	        }

	        return reversed;
	    }
}

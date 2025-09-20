package strings;

public class LongestSubStringWithoutRepeatingChar {
	public static void main(String[] args) {
        String s = "pwwkew";  
        int[] lastIndex = new int[256]; 
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }

        int start = 0, maxLen = 0, startIndex = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            if (lastIndex[ch] >= start) {
                start = lastIndex[ch] + 1; 
            }

            lastIndex[ch] = end;

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                startIndex = start;
            }
        }

        System.out.println("Length: " + maxLen);
        System.out.println("Substring: " + s.substring(startIndex, startIndex + maxLen));
    }
}

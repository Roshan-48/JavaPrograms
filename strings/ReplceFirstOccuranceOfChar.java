package strings;

public class ReplceFirstOccuranceOfChar {
	public static void main(String[] args) {
        String str = "Aeroplate";
        System.out.println(replaceFirstOccurrence(str, 't', 'n'));
    }

    public static String replaceFirstOccurrence(String str, char target, char replacement) {
    	String result = "";
        boolean replaced = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!replaced && ch == target) {
                result += replacement;  
                replaced = true;
            } else {
                result += ch;
            }
        }

        return result;
    } 
}


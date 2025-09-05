package strings;

public class ReverseWordsOfStringByBuilder {
	public static void main(String[] args) {
		String sentence = "Roshan Vijay Pawar";
		reverseWords(sentence);
	}
	
	public static void reverseWords(String sentence) {
		String[] words = sentence.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			
			StringBuilder reversedWords = new StringBuilder();
			
			for (int j = word.length()-1; j >= 0; j--) {
				reversedWords.append(word.charAt(j));
			}
			
			result.append(reversedWords).append(" ");
		}
		
		System.out.println(result);
	}
}

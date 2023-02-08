
public class ValidacaoPalindrome {

	public boolean isPalindrome(String text) {
		String cleanedText = text.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
		String reversedText = new StringBuilder(cleanedText).reverse().toString();
		return cleanedText.equals(reversedText);
	}

}

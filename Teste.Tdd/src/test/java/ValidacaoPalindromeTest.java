
import org.junit.Assert;
import org.junit.Test;

public class ValidacaoPalindromeTest {

	private ValidacaoPalindrome validator = new ValidacaoPalindrome();

	@Test
	public void testIsPalindrome() {
		Assert.assertTrue(validator.isPalindrome("Rotator"));
		Assert.assertTrue(validator.isPalindrome("bob"));
		Assert.assertTrue(validator.isPalindrome("madam"));
		Assert.assertTrue(validator.isPalindrome("mAlAyAlam"));
		Assert.assertTrue(validator.isPalindrome("1"));
		Assert.assertTrue(validator.isPalindrome("Able was I, ere I saw Elba"));
		Assert.assertTrue(validator.isPalindrome("Madam I'm Adam"));
		Assert.assertTrue(validator.isPalindrome("Step on no pets."));
		Assert.assertTrue(validator.isPalindrome("Top spot!"));
		Assert.assertTrue(validator.isPalindrome("02/02/2020"));
		Assert.assertTrue(validator.isPalindrome("Socorram-me subi no ônibus em marrocos"));
		Assert.assertFalse(validator.isPalindrome("xyz"));
		Assert.assertFalse(validator.isPalindrome("elephant"));
		Assert.assertFalse(validator.isPalindrome("Country"));
		Assert.assertFalse(validator.isPalindrome("Top . post!"));
		Assert.assertFalse(validator.isPalindrome("Wonderful-fool"));
		Assert.assertFalse(validator.isPalindrome("Wild imagination!"));
	}
}

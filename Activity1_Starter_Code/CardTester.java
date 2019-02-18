package Activity1_Starter_Code;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card firstCard = new Card("K", "Diamond", 5);
		Card secondCard = new Card("K", "Diamond", 5);
		Card thirdCard = new Card("Q", "Heart", 5);
		System.out.println(firstCard.matches(secondCard));
		System.out.println(firstCard.matches(thirdCard));
		System.out.println(firstCard.suit());
	}
}
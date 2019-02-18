package Activity2_Starter_Code;
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		for(int i = 0; i < ranks.length; i++) {
			Card each = new Card(ranks[i], suits[i], values[i]);
			cards.add(each);
		}
		size = cards.size();
		shuffle();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0) {
			return null;
		}
		else {
			 size--;
			 return cards.get(size);
		}
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
/*
 * --------------------------------Questions-------------------------------------------
 * 
 * Explain in your own words the relationship between a deck and a card.
 * 
 * A card is an array of data describing the card. A deck is an array of these card arrays.
 * 
 * Consider the deck initialized with the statements below. How many cards does the deck contain?
 * String[] ranks = {"jack", "queen", "king"};
 * String[] suits = {"blue", "red"};
 * int[] pointValues = {11, 12, 13};
 * Deck d = new Deck(ranks, suits, pointValues);
 * 
 * It should contain 3 cards.
 * 
 * The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2 
 * (lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point
 * value 10; an ace has point value 11; point values for 2, …, 10 are 2, …, 10, respectively. Specify the
 * contents of the ranks, suits, and pointValues arrays so that the statement
 * 
 * Deck d = new Deck(ranks, suits, pointValues);
 * 
 * initializes a deck for a Twenty-One game.
 * 
 * String[] ranks = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
 * String[] suits = {"spades", "hearts", "diamonds", "clubs"};
 * int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
 * 
 * Does the order of elements of the ranks, suits, and pointValues arrays matter?
 * 
 * Yes
 * 
*/

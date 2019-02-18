package Activity3_Starter_Code;

import java.util.Random;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 5;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[52];
		int k = 0;
		for (int j = 0; j < (values.length + 1) / 2; j++) {
			shuffled[k] = values[j];
			k+=2;
		}
		k = 1;
		for (int j = (values.length + 1) / 2; j < values.length; j++) {
			shuffled[k] = values[j];
			k+=2;
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[52];
		for (int k = 0; k < values.length; k++) {
			int j = getRandomNumberInRange(0, values.length - 1);
			if (values[j] != 0) {
				shuffled[k] = values[j];
				values[j] = 0;
			}
		}
	}
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
/*
 * --------------------------------Questions-------------------------------------------
 * 
 * Write a static method named flip that simulates a flip of a weighted coin by returning either
 * "heads" or "tails" each time it is called. The coin is twice as likely to turn up heads as tails.
 * Thus, flip should return "heads" about twice as often as it returns "tails."
 * 
 * public static String flip() {
 * 		int j = getRandomNumberInRange(1, 3);
 * 		if (j == 3 || j == 2) {
 * 			return "heads";
 * 		}
 * 		else {
 * 			return "tails";
 * 		}
 * }
 * 
 * Write a static method named arePermutations that, given two int arrays of the same length
 * but with no duplicate elements, returns true if one array is a permutation of the other (i.e., the
 * arrays differ only in how their contents are arranged). Otherwise, it should return false
 * 
 * public static boolean arePermutations(int[] a, int[] b) {
 * 		int count = a.length;
 * 		for (int i = 0; i < a.length; i++) {
 * 			for (int j = 0; j < b.length; j++) {
 * 				if (a[i] == b[j]) {
 * 					count--;
 * 				}
 * 			}
 * 		}
 * 		if (count == 0) {
 * 			return true;
 * 		}
 * 		else {
 * 			return false;
 * 		}
 * }
 * 
 * Suppose that the initial contents of the values array in Shuffler.java are {1, 2, 3,
 * 4}. For what sequence of random integers would the efficient selection shuffle change values to
 * contain {4, 3, 2, 1}?
 * 
 * 
 * 
 * */

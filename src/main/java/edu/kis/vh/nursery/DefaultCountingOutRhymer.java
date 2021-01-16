package edu.kis.vh.nursery;

/**
 *Rhymer that contains tab with max size = 11
 */
public class DefaultCountingOutRhymer {

	private static final int NUMBERS_LEN = 12;
	private static final int DEFAULT_TOTAL = -1;
	private static final int NOT_FOUND = -1;

	private final int[] NUMBERS = new int[NUMBERS_LEN];

	private int total = DEFAULT_TOTAL;

	/**
	 * @param in value to add
	 */
	protected void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/**
	 * @return true if tab is empty
	 */
	protected boolean callCheck() {
		return total == DEFAULT_TOTAL;
	}

	/**
	 * @return true if tab is full
	 */
	protected boolean isFull() {
		return total == NUMBERS_LEN - 1;
	}

	/**
	 * @return last value in tab
	 */
	protected int peekaboo() {
		if (callCheck())
			return NOT_FOUND;
		return NUMBERS[total];
	}

	/**
	 * @return return and delete last value in tab
	 */
	protected int countOut() {
		if (callCheck())
			return NOT_FOUND;
		return NUMBERS[total--];
	}

	/**
	 * @return current count of int in tab
	 */
	protected int getTotal() {
		return total;
	}

}

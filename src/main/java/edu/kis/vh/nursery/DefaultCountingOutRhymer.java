package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int NUMBERS_LEN = 12;
	private static final int DEFAULT_TOTAL = -1;
	private static final int NOT_FOUND = -1;

	private final int[] NUMBERS = new int[NUMBERS_LEN];

	private int total = DEFAULT_TOTAL;

	protected void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}


	protected boolean callCheck() {
		return total == DEFAULT_TOTAL;
	}
		
	protected boolean isFull() {
		return total == NUMBERS_LEN - 1;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return NOT_FOUND;
		return NUMBERS[total];
	}
			
	protected int countOut() {
		if (callCheck())
			return NOT_FOUND;
		return NUMBERS[total--];
	}

	protected int getTotal() {
		return total;
	}

}

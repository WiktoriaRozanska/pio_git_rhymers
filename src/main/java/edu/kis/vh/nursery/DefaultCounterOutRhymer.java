package edu.kis.vh.nursery;

public class DefaultCounterOutRhymer {

	private static final int NUMBERS_LEN = 12;
	private static final int DEFAULT_TOTAL = -1;

	private int[] NUMBERS = new int[NUMBERS_LEN];

	private int total = DEFAULT_TOTAL;

	protected void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	protected boolean callCheck() {
		return total == DEFAULT_TOTAL;
	}
		
	protected boolean isFull() {
		return total == 11;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_TOTAL;
		return NUMBERS[total];
	}
			
	protected int countOut() {
		if (callCheck())
			return DEFAULT_TOTAL;
		return NUMBERS[total--];
	}

	protected int getTotal() {
		return total;
	}

}

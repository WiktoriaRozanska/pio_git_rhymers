package edu.kis.vh.nursery;

public class DefaultCounterOutRhymer {

	private int[] NUMBERS = new int[12];

	private int total = -1;

	protected void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	protected boolean callCheck() {
		return total == -1;
	}
		
	protected boolean isFull() {
		return total == 11;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}
			
	protected int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

	protected int getTotal() {
		return total;
	}

}

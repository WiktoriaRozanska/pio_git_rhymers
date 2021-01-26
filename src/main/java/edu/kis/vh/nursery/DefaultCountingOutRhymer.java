package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;

public class DefaultCountingOutRhymer {

	private IntArrayStack intArrayStack;

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	public DefaultCountingOutRhymer() {
		this.intArrayStack = new IntArrayStack();
	}

	public void countIn(int in) {
		intArrayStack.push(in);
	}

	public boolean callCheck() {
		return intArrayStack.isEmpty();
	}
		
	public boolean isFull() {
		return intArrayStack.isFull();
	}

	protected int peekaboo() {
		return intArrayStack.peekaboo();
	}

	public int countOut() {
		return intArrayStack.pop();
	}

}

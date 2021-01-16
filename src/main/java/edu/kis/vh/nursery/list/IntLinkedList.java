package edu.kis.vh.nursery.list;

public final class IntLinkedList {

	private Node last;
	public static final int DEFAULT_VALUE = -1;

	protected void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	protected boolean isEmpty() {
		return last == null;
	}

	protected boolean isFull() {
		return false;
	} //TODO: needs adding condition

	protected int top() {
		if (isEmpty())
			return DEFAULT_VALUE;
		return last.value;
	}

	protected int pop() {
		if (isEmpty())
			return DEFAULT_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}

final class Node {

	protected final int value;
	protected Node prev, next;

	protected Node(int i) {
		value = i;
	}

}

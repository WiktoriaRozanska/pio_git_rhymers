package edu.kis.vh.nursery.collection;

public interface Stack {
    static final int NOT_FOUND = -1;
    boolean isFull();
    boolean isEmpty();
    void push(int i);
    int pop();
}

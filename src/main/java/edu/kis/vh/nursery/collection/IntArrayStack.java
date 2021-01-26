package edu.kis.vh.nursery.collection;

public class IntArrayStack implements Stack {
    private static final int MAX_SIZE = 12;
    private static final int DEFAULT_TOTAL = -1;
    private static final int NOT_FOUND = 0;
    private int[] numbers = new int[MAX_SIZE];

    public int total = -1;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == DEFAULT_TOTAL;
    }

    @Override
    public boolean isFull() {
        return total == MAX_SIZE-1;
    }


    public int peekaboo() {
        if (isEmpty())
            return NOT_FOUND;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return NOT_FOUND;
        return numbers[total--];
    }

}

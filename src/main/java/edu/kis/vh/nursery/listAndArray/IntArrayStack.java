package edu.kis.vh.nursery.listAndArray;

public class IntArrayStack implements IntStackOrList {
    private final int STACK_SIZE = 12;
    private final int[] numbers = new int[STACK_SIZE];

    public int total = -1;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == -1;
    }

    public boolean isFull() {
        return total == STACK_SIZE - 1;
    }

    public int peek() {
        if (isEmpty())
            return IF_EMPTY;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        return numbers[total--];
    }
}

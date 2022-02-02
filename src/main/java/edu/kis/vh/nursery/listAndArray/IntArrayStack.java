package edu.kis.vh.nursery.listAndArray;

public class IntArrayStack implements IntStackList {
    private final int n = 12;
    private final int[] numbers = new int[n];
    private final int ifEmpty = 0;

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == n-1;
    }

    public int peekABoo() {
        if (callCheck())
            return ifEmpty;
        return numbers[total];
    }


    public int countOut() {
        if (callCheck())
            return ifEmpty;
        return numbers[total--];
    }
}

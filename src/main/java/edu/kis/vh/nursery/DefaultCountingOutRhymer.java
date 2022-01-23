package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int n = 12;
    private final int[] numbers = new int[n];

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

    protected int peekABoo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }


    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}

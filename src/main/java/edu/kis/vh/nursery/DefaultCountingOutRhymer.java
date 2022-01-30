package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer() {
        intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    public int peekABoo(){
        return intArrayStack.peekABoo();
    }

}

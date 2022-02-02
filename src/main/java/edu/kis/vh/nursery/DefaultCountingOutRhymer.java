package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listAndArray.IntArrayStack;
import edu.kis.vh.nursery.listAndArray.IntStackList;

public class DefaultCountingOutRhymer implements IntStackList {

    private IntStackList intArrayStack;

    public DefaultCountingOutRhymer() {
        intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntStackList intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    @Override
	public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    @Override
	public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    @Override
	public boolean isFull() {
        return intArrayStack.isFull();
    }

    @Override
	public int countOut() {
        return intArrayStack.countOut();
    }

    @Override
	public int peekABoo(){
        return intArrayStack.peekABoo();
    }

}

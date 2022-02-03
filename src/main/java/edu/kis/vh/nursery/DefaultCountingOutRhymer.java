package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listAndArray.IntArrayStack;
import edu.kis.vh.nursery.listAndArray.IntStackOrList;

public class DefaultCountingOutRhymer {

    private IntStackOrList intStackOrList;

    public DefaultCountingOutRhymer() {
        intStackOrList = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntStackOrList intStackOrList) {
        this.intStackOrList = intStackOrList;
    }

	public void countIn(int in) {
        intStackOrList.push(in);
    }

	public boolean callCheck() {
        return intStackOrList.isEmpty();
    }

	public boolean isFull() {
        return intStackOrList.isFull();
    }

	public int countOut() {
        return intStackOrList.pop();
    }

	public int peekABoo(){
        return intStackOrList.peek();
    }

}

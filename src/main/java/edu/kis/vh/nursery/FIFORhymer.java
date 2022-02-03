package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listAndArray.IntArrayStack;
import edu.kis.vh.nursery.listAndArray.IntStackOrList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntArrayStack()); 

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IntStackOrList intArrayStack) {
		super(intArrayStack);
	}
}

package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listAndArray.IntArrayStack;
import edu.kis.vh.nursery.listAndArray.IntStackList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public IntStackList temp = new DefaultCountingOutRhymer(new IntArrayStack()); //??? nie bardzo wiem czy o to chodziło w poleceniu 2.2.8

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

	public FIFORhymer(IntStackList intArrayStack) {
		super(intArrayStack);
	}
}

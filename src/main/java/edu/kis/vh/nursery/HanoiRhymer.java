package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listAndArray.IntStackOrList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(IntStackOrList intStackOrList) {
		super(intStackOrList);
	}

	@Override
    public void countIn(int in) {
        if (!callCheck() && in > countOut())
            totalRejected++;
        else
            super.countIn(in);
    }
}

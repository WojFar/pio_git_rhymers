package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	private int totalRejected = 0;

	/**
	 * Returns number of total rejected
	 * @return int
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/**
	 * I have no clue apparently but it's counting something
	 * @param int
	 */
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

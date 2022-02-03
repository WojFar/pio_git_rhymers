package edu.kis.vh.nursery.listAndArray;

public interface IntStackOrList {

    public final int IF_EMPTY = 0;

	public void push(int in);

	public boolean isEmpty();

	public boolean isFull();

	public int pop();

	public int peek();

}
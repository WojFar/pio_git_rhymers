package edu.kis.vh.nursery.listAndArray;

public class IntLinkedList implements IntStackList {

	private final int ifEmpty = 0;
	
    Node last;
    int i;

    public void countIn(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean callCheck() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int peekABoo() {
        if (callCheck())
            return ifEmpty;
        return last.value;
    }

    public int countOut() {
        if (callCheck())
            return ifEmpty;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}

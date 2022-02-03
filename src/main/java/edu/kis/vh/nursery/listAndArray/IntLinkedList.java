package edu.kis.vh.nursery.listAndArray;

public class IntLinkedList implements IntStackOrList {

    private Node last;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int peek() {
        if (isEmpty())
            return IF_EMPTY;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}

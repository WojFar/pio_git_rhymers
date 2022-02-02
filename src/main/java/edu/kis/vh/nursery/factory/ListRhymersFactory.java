package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.listAndArray.IntLinkedList;

public class ListRhymersFactory implements RhymersFactory {

    @Override
    public DefaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer GetFalseRhymer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer GetStandardRhymer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    
    
}

package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.factory.ArrayRhymersFactory;
import edu.kis.vh.nursery.listAndArray.IntStackList;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        IntStackList rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekABoo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        IntStackList rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        IntStackList rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        IntStackList rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = 0; // nie zmieniłem przy 2.2.6

        int result = rhymer.peekABoo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekABoo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekABoo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        IntStackList rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = 0; // nie zmieniłem przy 2.2.6

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}

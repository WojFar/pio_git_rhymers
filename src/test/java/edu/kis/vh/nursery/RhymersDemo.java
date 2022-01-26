package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

class RhymersDemo {
    // 1.5.2 usunięto klasę DefaultRhymersFactory
    // a przez to interface RhymersFactory i folder factory

    /**
     * main method runs testRhymers()
     * 
     * @param args
     */

    public static void main(String[] args) {
        testRhymers();
    }

    /**
     * Creates 4 rhymers: 2 default, FIFO and Hanoi. Counts them in and out printing
     * the results
     */
    private static void testRhymers() {
        DefaultCountingOutRhymer[] rhymers = { new DefaultCountingOutRhymer(), new DefaultCountingOutRhymer(),
                new FIFORhymer(), new HanoiRhymer() };

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }

}
package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.ArrayRhymersFactory;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;
import edu.kis.vh.nursery.listAndArray.IntStackList;

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
        RhymersFactory factory = new DefaultRhymersFactory();

        IntStackList[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer() };

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

        RhymersFactory factoryArray = new ArrayRhymersFactory();

        IntStackList[] rhymersArray = { factoryArray.GetStandardRhymer(), factoryArray.GetFalseRhymer(),
                factoryArray.GetFIFORhymer(), factoryArray.GetHanoiRhymer() };

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymersArray[j].countIn(i);

        //java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymersArray[3].countIn(rn.nextInt(20));

        for (int i = 0; i < rhymersArray.length; i++) {
            while (!rhymersArray[i].callCheck())
                System.out.print(rhymersArray[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymersArray[3]).reportRejected());

        RhymersFactory factoryList = new ListRhymersFactory();

        IntStackList[] rhymersList = { factoryList.GetStandardRhymer(), factoryList.GetFalseRhymer(),
                factoryList.GetFIFORhymer(), factoryList.GetHanoiRhymer() };

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymersList[j].countIn(i);

        //java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymersList[3].countIn(rn.nextInt(20));

        for (int i = 0; i < rhymersList.length; i++) {
            while (!rhymersList[i].callCheck())
                System.out.print(rhymersList[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymersList[3]).reportRejected());
    }

}
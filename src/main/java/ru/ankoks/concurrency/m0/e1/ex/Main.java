package ru.ankoks.concurrency.m0.e1.ex;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class Main {

    public static void main(String[] args) {
        final int[] test1 = {1, 2, 3};

        SummThread summThread = new SummThread(test1);

        System.out.println(summThread.getResult());
    }
}

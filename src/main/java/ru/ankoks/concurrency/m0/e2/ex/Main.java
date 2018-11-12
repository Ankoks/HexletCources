package ru.ankoks.concurrency.m0.e2.ex;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class Main {
    public static void main(String[] args) {
        final int[] test1 = {1, 2, 3, 7, 13, 0, 6};

        MaxRunnable maxRunnable = new MaxRunnable(test1);

        System.out.println(maxRunnable.getResult());
    }
}

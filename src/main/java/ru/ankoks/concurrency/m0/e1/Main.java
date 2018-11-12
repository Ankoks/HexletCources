package ru.ankoks.concurrency.m0.e1;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class Main {
    public static void main(String[] args) {
        final long before = System.currentTimeMillis();
        //...
        final long after = System.currentTimeMillis();

        System.out.printf("Time delta: %d", (after-before)/1_000);
    }
}

package ru.ankoks.concurrency.m0.e3.ex;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class ThreadHelper {
    public static void startAndJoinThread(final Thread t) throws Exception {
        // BEGIN (write your solution here)
        t.start();
        t.join();
        // END
    }
}

package ru.ankoks.concurrency.m0.e1;

import ru.ankoks.concurrency.m0.e0.MockLoader;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class Main {
    public static void main(String[] args) {
        final long before = System.currentTimeMillis();

//        final Thread loader = new TextLoaderThread(new MockLoader("thread1"));
//        loader.start();

        TextLoaderRunnable runnableThread = new TextLoaderRunnable(new MockLoader("thread2"));
        runnableThread.run();
        new Thread(runnableThread).start();

        final long after = System.currentTimeMillis();

        System.out.printf("Time delta: %d\n", (after-before)/1_000);
    }
}

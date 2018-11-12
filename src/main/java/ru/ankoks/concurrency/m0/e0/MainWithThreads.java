package ru.ankoks.concurrency.m0.e0;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class MainWithThreads {
    public static void main(String[] args) throws InterruptedException {
        final ITextLoader fileTextLoader = new MockLoader("textFromFile");
        final ITextLoader webTextLoader = new MockLoader("textFromWeb");
        final long before = System.currentTimeMillis();

        final Thread fileTextLoaderThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(fileTextLoader.loadText());
            }
        });
        fileTextLoaderThread.start();
        final Thread webTextLoaderThread = new Thread(() -> System.out.println(webTextLoader.loadText()));
        webTextLoaderThread.start();

        fileTextLoaderThread.join();
        webTextLoaderThread.join();

        final long after = System.currentTimeMillis();

        System.out.printf("Time delta: %d", (after-before)/1_000);
    }
}

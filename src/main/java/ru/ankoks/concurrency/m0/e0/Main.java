package ru.ankoks.concurrency.m0.e0;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class Main {

    public static void main(String[] args) {
        final ITextLoader fileTextLoader = new MockLoader("textFromFile");
        final ITextLoader webTextLoader = new MockLoader("textFromWeb");
        final long before = System.currentTimeMillis();

        System.out.println(fileTextLoader.loadText());
        System.out.println(webTextLoader.loadText());

        final long after = System.currentTimeMillis();

        System.out.printf("Time delta: %d", (after-before)/1_000);
    }
}

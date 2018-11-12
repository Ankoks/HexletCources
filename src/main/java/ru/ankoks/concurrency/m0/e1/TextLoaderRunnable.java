package ru.ankoks.concurrency.m0.e1;

import ru.ankoks.concurrency.m0.e0.ITextLoader;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class TextLoaderRunnable implements Runnable {

    private final ITextLoader loader;

    public TextLoaderRunnable(ITextLoader loader) {
        this.loader = loader;
    }

    @Override
    public void run() {
        System.out.println(loader.loadText());
    }
}

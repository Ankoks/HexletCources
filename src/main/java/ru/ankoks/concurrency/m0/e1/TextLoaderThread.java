package ru.ankoks.concurrency.m0.e1;

import ru.ankoks.concurrency.m0.e0.ITextLoader;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class TextLoaderThread extends Thread {
    private final ITextLoader textLoader;


    public TextLoaderThread(ITextLoader textLoader) {
        this.textLoader = textLoader;
    }

    @Override
    public void run() {
        System.out.println(textLoader.loadText());
    }
}

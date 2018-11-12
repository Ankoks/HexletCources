package ru.ankoks.concurrency.m0.e0;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class MockLoader implements ITextLoader {
    private final String textToLoad;

    public MockLoader(String textLoaded) {
        this.textToLoad = textLoaded;
    }

    @Override
    public String loadText() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return textToLoad;
    }
}

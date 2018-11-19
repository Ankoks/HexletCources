package ru.ankoks.concurrency.m2.e0;

/**
 * User: ankoks
 * Date: 19.11.2018
 */
public class SumRunnable implements Runnable {
    private final int a;
    private final int b;

    private int result;

    public SumRunnable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        result = a + b;
    }

    public int getResult() {
        return result;
    }
}

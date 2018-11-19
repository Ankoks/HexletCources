package ru.ankoks.concurrency.m2.e0;

import java.util.concurrent.Callable;

/**
 * User: ankoks
 * Date: 19.11.2018
 */
public class SumCollable implements Callable<Integer> {
    private final int a;
    private final int b;

    public SumCollable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() {
        return a + b;
    }
}

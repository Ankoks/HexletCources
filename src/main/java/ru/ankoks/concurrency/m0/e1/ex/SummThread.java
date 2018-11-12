package ru.ankoks.concurrency.m0.e1.ex;

import java.util.Arrays;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
class SummThread extends Thread {
    final int[] toSumm;
    private int summ;

    public SummThread(int[] toSumm) {
        this.toSumm = toSumm;
    }

    public int getResult() {
//        Arrays.stream(toSumm).sum();

        for (int aToSumm : toSumm) {
            summ += aToSumm;
        }

        return summ;
    }
}

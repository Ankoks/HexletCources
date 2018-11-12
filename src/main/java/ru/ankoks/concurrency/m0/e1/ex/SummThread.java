package ru.ankoks.concurrency.m0.e1.ex;

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
        for (int i = 0; i < toSumm.length; i++) {
            summ += toSumm[i];
        }

        return summ;
    }
}

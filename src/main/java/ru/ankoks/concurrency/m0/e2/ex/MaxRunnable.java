package ru.ankoks.concurrency.m0.e2.ex;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class MaxRunnable implements Runnable {
    final int[] target;
    int max;

    public MaxRunnable(int[] target) {
        this.target = target;
    }

    public int getResult() {

        for (int aTarget : target) {
            if (max < aTarget) {
                max = aTarget;
            }
        }

        return max;
    }

    @Override
    public void run() {

    }
}

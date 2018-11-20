package ru.ankoks.concurrency.m3.e0;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * User: ankoks
 * Date: 20.11.2018
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        final IntList intList = new IntList();
        final Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    intList.add(i);
                }
            }
        };

        final Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    intList.add(i);
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.printf("Size: %d", intList.getSize());


    }
    private Map<Object, Object> map = new HashMap<>();
    public Object random() {
        return map.keySet().toArray()[new Random().nextInt(map.size())];
    }
}

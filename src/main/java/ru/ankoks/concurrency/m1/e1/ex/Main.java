package ru.ankoks.concurrency.m1.e1.ex;

import java.util.concurrent.ExecutionException;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(ThreadHelper.fib(9));
    }
}

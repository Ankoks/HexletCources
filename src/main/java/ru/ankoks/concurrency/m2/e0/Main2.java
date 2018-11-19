package ru.ankoks.concurrency.m2.e0;

import java.util.concurrent.*;

/**
 * User: ankoks
 * Date: 19.11.2018
 */
public class Main2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final ExecutorService executorService = Executors.newWorkStealingPool(3);
        final Callable<Integer> sum = new SumCollable(1, 2);
        Future<Integer> submit = executorService.submit(sum);
        System.out.println(submit.get());
    }
}

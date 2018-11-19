package ru.ankoks.concurrency.m2.e0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * User: ankoks
 * Date: 19.11.2018
 */
public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService executorService = Executors.newWorkStealingPool(3);

        final SumRunnable sum = new SumRunnable(1, 2);

        final Future<?> future = executorService.submit(sum);

        future.get();

        System.out.println(sum.getResult());
    }


}

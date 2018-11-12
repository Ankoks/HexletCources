package ru.ankoks.concurrency.m1.e1.ex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class ThreadHelper {

    public static final ExecutorService EXECUTOR_SERVICE = Executors.newWorkStealingPool();
    // BEGIN (write your solution here)

    // END

    public static int fib(final int numberToCalculate) throws ExecutionException, InterruptedException {
        // BEGIN (write your solution here)
        final FibCalculator calculator = new FibCalculator(numberToCalculate);

        Future<?> submit = EXECUTOR_SERVICE.submit(calculator);

        submit.get();

        return calculator.getResult();
        // END
    }

    private static class FibCalculator implements Runnable {

        private final int currentNum;

        private int result;

        public FibCalculator(final int numberToCalculate) {
            this.currentNum = numberToCalculate;
        }

        @Override
        public void run() {
            if (currentNum == 1 || currentNum == 2) {
                result = 1;
                return;
            }
            final FibCalculator left = new FibCalculator(currentNum - 1);
            final FibCalculator right = new FibCalculator(currentNum - 2);
            final Future leftF =  EXECUTOR_SERVICE.submit(left);
            final Future rightF =  EXECUTOR_SERVICE.submit(right);
            try {
                leftF.get();
                rightF.get();
            } catch (final InterruptedException | ExecutionException ignored) {

            }
            result = left.getResult() + right.getResult();
        }

        public int getResult() {
            return result;
        }

    }
}

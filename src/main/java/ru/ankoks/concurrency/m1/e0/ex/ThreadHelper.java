package ru.ankoks.concurrency.m1.e0.ex;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class ThreadHelper {
    public static int fib(final int numberToCalculate) throws Exception {
        final FibCalculator calculator = new FibCalculator(numberToCalculate);
        calculator.start();
        calculator.join();
        return calculator.getResult();
    }

    public static void main(String[] args) {
        FibCalculator fibCalculator = new FibCalculator(9);

        System.out.println(fibCalculator.getResult());
    }

    private static class FibCalculator extends Thread {
        // BEGIN (write your solution here)
        final int currentNum;

        private int result;

        private FibCalculator(int numberToCalculate) {
            this.currentNum = numberToCalculate;
        }

        @Override
        public void run() {
            if (currentNum == 1 || currentNum == 2) {
                result = 1;
                return;
            }

            FibCalculator left = new FibCalculator(currentNum - 2);
            FibCalculator right = new FibCalculator(currentNum - 1);

            left.start();
            right.start();

            try {
                left.join();
                right.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            result = left.getResult() + right.getResult();
        }

        public int getResult() {
            return result;
        }
        // END
    }
}

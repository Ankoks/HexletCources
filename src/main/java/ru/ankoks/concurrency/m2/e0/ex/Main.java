package ru.ankoks.concurrency.m2.e0.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;

/**
 * User: ankoks
 * Date: 19.11.2018
 */
public class Main {
    public static void main(String... args) throws Exception {
        MaxFinder finder = new MaxFinder(new Integer[]{1, 2, 3, 4});
        System.out.println(finder.call());
//        testArray(new Integer[0], 0);
//        testArray(new Integer[]{1, 4, 10, 2}, 10);
//        testArray(new Integer[]{1, 4, -10, 2}, 4);
//        testArray(new Integer[]{1}, 1);
    }

    private static void testArray(final Integer[] inputArray, final int expectedResult) {
        final int actualResult = new MaxFinder(inputArray).call();
        if (actualResult != expectedResult) {
            throw new RuntimeException(
                    String.format(
                            "Actual max: %d, expected max: %d",
                            actualResult,
                            expectedResult));
        }
    }

    static class MaxFinder implements Callable<Integer> {
        private final Integer[] array;

        MaxFinder(Integer[] array) {
            this.array = array;
        }

        @Override
        public Integer call() {
            // less java 8 solution ==============================================
//            if (array.length == 0) return 0;
//
//            int temp = array[0];
//            for (int i = 0; i < array.length-1; i++) {
//                if (temp < array[i+1]) {
//                    temp = array[i+1];
//                }
//            }
//
//            return temp;

            // Other solution ====================================================
            if (array.length == 0) return 0;

            return Arrays.stream(array).max(Comparator.comparingInt(o -> o)).get();
        }
    }
}

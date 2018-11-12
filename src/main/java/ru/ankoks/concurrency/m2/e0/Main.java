package ru.ankoks.concurrency.m2.e0;

/**
 * User: ankoks
 * Date: 09.11.2018
 */
public class Main {
    public static void main(String[] args) {
        startConcert(new HumanSinger("Max"));
    }

    private static <T extends Human & ISinger> void startConcert(T maestro) {
        System.out.println("On the stage is " + maestro.getName());
        maestro.sing();
    }
}

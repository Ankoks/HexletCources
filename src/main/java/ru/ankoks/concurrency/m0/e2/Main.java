package ru.ankoks.concurrency.m0.e2;

/**
 * User: ankoks
 * Date: 07.11.2018
 */
public class Main {

    public static void main(String[] args) {
        Tuple2<Long, String> pair = new Tuple2<>(1L, "Anton");

        System.out.println(pair.getLeft() + " - " + pair.getRight());
    }
}

package ru.ankoks.concurrency.m0.e2;

/**
 * User: ankoks
 * Date: 07.11.2018
 */
public class Tuple2<T1, T2> {

    private T1 left;
    private T2 right;

    public Tuple2(T1 left, T2 right) {
        this.left = left;
        this.right = right;
    }

    public T1 getLeft() {
        return left;
    }

    public T2 getRight() {
        return right;
    }
}

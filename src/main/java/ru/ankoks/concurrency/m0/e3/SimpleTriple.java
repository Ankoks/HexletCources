package ru.ankoks.concurrency.m0.e3;

/**
 * User: ankoks
 * Date: 07.11.2018
 */
public class SimpleTriple<T> extends Tuple3<T, T> {
    private final T middle;

    public SimpleTriple(T left, T right, T middle) {
        super(left, right);
        this.middle = middle;
    }

    public T getMiddle() {
        return middle;
    }
}

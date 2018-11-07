package ru.ankoks.e3;

/**
 * User: ankoks
 * Date: 07.11.2018
 */
public class Tuple3<T1, T2> {

    private final T1 left;
    private final T2 right;

    public Tuple3(T1 left, T2 right) {
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
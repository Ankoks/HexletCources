package ru.ankoks.concurrency.m0.e1;

/**
 * User: ankoks
 * Date: 06.11.2018
 */
public class StringTuple {
    private final String left;

    private final String right;

    public StringTuple(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }
}

package ru.ankoks.generics.m0.e3;

/**
 * User: ankoks
 * Date: 07.11.2018
 */
public class StringTriple extends Tuple3<String, String> {
    private final String middle;

    public StringTriple(String left, String middle, String right) {
        super(left, right);
        this.middle = middle;
    }

    public String getMiddle() {
        return middle;
    }
}

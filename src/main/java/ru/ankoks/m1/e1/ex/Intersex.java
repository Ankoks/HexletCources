package ru.ankoks.m1.e1.ex;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class Intersex implements Human {
    private final String name;

    public Intersex(String name) {
        this.name = name;
    }

    @Override
    public Sex getSex() {
        return Sex.I;
    }

    @Override
    public String getName() {
        return name;
    }
}

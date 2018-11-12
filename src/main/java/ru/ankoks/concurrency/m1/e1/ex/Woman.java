package ru.ankoks.concurrency.m1.e1.ex;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class Woman implements Human {
    private final String name;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public Sex getSex() {
        return Sex.F;
    }

    @Override
    public String getName() {
        return name;
    }
}

package ru.ankoks.generics.m1.e3.ex;

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

package ru.ankoks.generics.m1.e4.ex;

/**
 * User: ankoks
 * Date: 09.11.2018
 */
public class Man implements Human {
    private final String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public Sex getSex() {
        return Sex.M;
    }

    @Override
    public String getName() {
        return name;
    }
}

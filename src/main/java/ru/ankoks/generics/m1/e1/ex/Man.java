package ru.ankoks.generics.m1.e1.ex;

/**
 * User: ankoks
 * Date: 08.11.2018
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

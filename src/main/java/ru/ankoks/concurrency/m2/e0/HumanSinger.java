package ru.ankoks.concurrency.m2.e0;

/**
 * User: ankoks
 * Date: 09.11.2018
 */
public class HumanSinger extends Human implements ISinger {

    public HumanSinger(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("trololo");
    }
}

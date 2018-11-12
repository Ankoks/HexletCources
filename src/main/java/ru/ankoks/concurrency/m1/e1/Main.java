package ru.ankoks.concurrency.m1.e1;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class Main {
    public static void main(String[] args) {
        Human h = new Human();

        SpaceShip ss = new SpaceShip(h);

        ss.showLFName();
        System.out.println(h.getName());
    }
}

package ru.ankoks.generics.m1.e1;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class Main3 {
    public static void main(String[] args) {
        Human h = new Human();

        SpaceShip3<Human> ss = new SpaceShip3<>(h);
        Human lf = ss.getLF();
        System.out.println(lf.getName());
        ss.showLFName();
    }
}

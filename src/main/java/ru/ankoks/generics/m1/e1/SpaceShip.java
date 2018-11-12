package ru.ankoks.generics.m1.e1;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class SpaceShip {
    private final LifeForm lf;

    public SpaceShip(LifeForm lf) {
        this.lf = lf;
    }

    public LifeForm getLF() {
        return lf;
    }

    public void showLFName() {
        System.out.println(lf.getName());
    }
}

package ru.ankoks.m1.e1;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class SpaceShip3<T extends LifeForm> {
    private final T lf;

    public SpaceShip3(T lf) {
        this.lf = lf;
    }

    public T getLF() {
        return lf;
    }

    public void showLFName() {
        System.out.println(lf.getName());
    }
}

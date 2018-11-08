package ru.ankoks.m1.e1;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class Main2 {
    public static void main(String[] args) {
        Human h = new Human();

        SpaceShip2<Human> ss = new SpaceShip2<>(h);

        // Нет метода, так как в SpaceShip2 не известно какая будет форма. В байт коде форма это просто Object
//        ss.showLFName();
        Human lf = ss.getLF();

        System.out.println(h.getName());
    }
}

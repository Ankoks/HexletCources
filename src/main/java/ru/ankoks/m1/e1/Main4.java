package ru.ankoks.m1.e1;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class Main4 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(1);
        Box b2 = b1;

        b2.setItem("Hello");

        System.out.println(b1);
        System.out.println(b2);

        Integer item = b1.getItem();

        System.out.println(item);
    }
}

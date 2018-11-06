package ru.ankoks;

/**
 * User: ankoks
 * Date: 06.11.2018
 */
public class Main {

    public static void main(String[] args) {
        final Tuple student1 = new Tuple(1, "Anton");

        final String name = (String) student1.getRight();

        System.out.println(name);
    }
}

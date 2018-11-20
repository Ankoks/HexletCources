package ru.ankoks.other;

import java.util.Random;

/**
 * User: ankoks
 * Date: 20.11.2018
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(new Random().nextInt(3));
        }
    }
}

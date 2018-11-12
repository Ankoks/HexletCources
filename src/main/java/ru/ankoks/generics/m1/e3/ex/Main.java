package ru.ankoks.generics.m1.e3.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class Main {
    public static void main(String[] args) {
        //"Слава", "Максим", "Глеб", "Слава"
        List<Human> list = new ArrayList<>();

        list.add(new Man("Слава", Sex.M)); //0
        list.add(new Man("Максим", Sex.M)); //1
        list.add(new Man("Глеб", Sex.M)); //2
        list.add(new Man("Слава", Sex.M)); //3

        final Man slava = new Man("Слава", Sex.M);

        System.out.println(CollectionHelper.findFirstIndex(list, slava));
        System.out.println(CollectionHelper.findLastIndex(list, slava));

        final Man maxim = new Man("Максим", Sex.M);

        System.out.println(CollectionHelper.findFirstIndex(list, maxim));
        System.out.println(CollectionHelper.findLastIndex(list, maxim));
    }
}

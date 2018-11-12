package ru.ankoks.generics.m1.e3;

import java.util.ArrayList;
import java.util.List;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class Main {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(CollectionsHelper.findIndex(list, "3"));
    }
}

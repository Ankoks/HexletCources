package ru.ankoks.m1.e3;

import java.util.ArrayList;
import java.util.List;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class Main {
    public static void main(String[] args) {
        final List list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);

        CollectionsHelper helper = new CollectionsHelper();

        System.out.println(helper.findIndex(list, "asd"));
    }
}

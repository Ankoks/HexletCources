package ru.ankoks.m1.e0;

import java.util.ArrayList;
import java.util.List;

/**
 * User: ankoks
 * Date: 07.11.2018
 */
public class Main {

    public static void main(String[] args) {
        // var. 1
        Box<Integer> myBox = new Box<>(1);
        Integer item = myBox.getItem();
        System.out.println(item);

        //var. 2
        Box box = new Box(2);
        Integer item1 = (Integer) box.getItem();
        System.out.println(item1);

        //var. 3
        List<Integer> list = new ArrayList<>();
        list.add(1);
        show(list);
    }

    private static void show(List list) {
        list.forEach(System.out::println);
    }
}
